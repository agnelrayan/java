package com.expertzlab.hbaseex;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.client.HBaseAdmin;

import java.io.IOException;

public class ListTable {
    public static void main(String[] args) throws MasterNotRunningException,IOException {
        Configuration configuration = HBaseConfiguration.create();

        HBaseAdmin hBaseAdmin = new HBaseAdmin(configuration);

        HTableDescriptor[] descriptors = hBaseAdmin.listTables();

        for(int i=0;i<descriptors.length;i++){
            System.out.println(descriptors[i].getNameAsString());
        }

    }
}
