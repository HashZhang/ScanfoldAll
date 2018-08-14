package com.github.hashJang.scanfold.elasticsearch.client;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ESTransportClient {

    public static void main(String[] args) {
        String sub1 = "123";
        String sub2 = "456";
        String string1 = "123" + "456";
        String string2 = "123456";
        String string3 = new String(string1);
        String string4 = string3.intern();
        String string5 = sub1 + sub2;
        String string6 = sub1 + sub2 + sub1 + sub2;
        System.out.println("你好".length());
        System.out.println("hello".length());

        System.out.println("\uD835\uDD6B\uD835\uDD6B");
        System.out.println("\uD835\uDD6B\uD835\uDD6B".length());
        System.out.println("\uD835\uDD6B\uD835\uDD6B".codePointCount(0,"\uD835\uDD6B\uD835\uDD6B".length() - 1));

        System.out.println("\uD835\uDD6B".charAt(0));
        System.out.println("\uD835\uDD6B".charAt(1));
        System.out.println("\uD835\uDD6B\uD835\uDD6B".codePointAt(0));
        System.out.println("\uD835\uDD6B\uD835\uDD6B".codePointAt(1));
        System.out.println("\uD835\uDD6B\uD835\uDD6B".codePointAt(2));
        System.out.println("\uD835\uDD6B\uD835\uDD6B".codePointAt(3));
        System.exit(0);
    }
}
