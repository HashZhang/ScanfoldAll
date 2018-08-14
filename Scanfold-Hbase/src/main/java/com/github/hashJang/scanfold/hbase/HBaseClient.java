package com.github.hashJang.scanfold.hbase;

import org.apache.hadoop.hbase.HBaseConfiguration;

public class HBaseClient {
    public static void main(String[] args) {
        HBaseConfiguration hconfig = (HBaseConfiguration) HBaseConfiguration.create();

        hconfig.set("hbase.zookeeper.property.clientPort","2181");
    }
}
