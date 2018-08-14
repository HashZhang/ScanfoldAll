package com.github.hashZhang.scanfold.jdk.reference;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class WeakReferenceDemo {
    public static void main(String[] args) throws InterruptedException {
        ReferenceQueue<TestNormalObject> testNormalObjectReferenceQueue = new ReferenceQueue<>();
        ReferenceQueue<TestFinalizeObject> testFinalizeObjectReferenceQueue = new ReferenceQueue<>();

        TestNormalObject testNormalObject = new TestNormalObject();
        WeakReference<TestNormalObject> testNormalObjectWeakReference = new WeakReference<>(testNormalObject, testNormalObjectReferenceQueue);
        TestFinalizeObject testFinalizeObject = new TestFinalizeObject();
        WeakReference<TestFinalizeObject> testFinalizeObjectWeakReference = new WeakReference<>(testFinalizeObject, testFinalizeObjectReferenceQueue);

        System.out.println(testNormalObjectWeakReference);
        System.out.println(testFinalizeObjectWeakReference);

        //强引用去掉。让对象只剩下软引用
        testNormalObject = null;
        testFinalizeObject = null;

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("GOT From Queue: " + testNormalObjectReferenceQueue.remove().get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread1.start();
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                try {
                    System.out.println("GOT From Queue: " + testFinalizeObjectReferenceQueue.remove().get());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread2.start();

        //显示请求GC，但是不一定会立刻GC
        System.gc();

        thread1.join();
        thread2.join();
    }

    /**
     * 第一种类。未覆盖finalize
     */
    public static class TestNormalObject {
    }

    /**
     * 第二种类。覆盖finalize的类
     */
    public static class TestFinalizeObject {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Finalize is called");
        }
    }
}
