package com.expertzlab.hbaseex;

import java.io.IOException;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.client.HBaseAdmin;

public class DeleteTable {

    public static void main(String[] args) throws IOException {

        // Instantiating configuration class
        Configuration conf = HBaseConfiguration.create();

        // Instantiating HBaseAdmin class
        HBaseAdmin admin = new HBaseAdmin(conf);

        // disabling table named emp
        admin.disableTable("test");

        // Deleting emp
        admin.deleteTable("test");
        System.out.println("Table deleted");
    }
}
