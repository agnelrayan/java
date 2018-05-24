package com.expertzlab.hbaseex;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.HBaseAdmin;

import java.io.IOException;
public class CreateTable {
    public static void main(String[] args) throws IOException {
        createTable();
    }

    private static void createTable() throws IOException {

        Configuration conf = new HBaseConfiguration();
        HBaseAdmin admin = new HBaseAdmin(conf);

        HTableDescriptor descriptor = new HTableDescriptor(TableName.valueOf("dep"));
        descriptor.addFamily(new HColumnDescriptor("personal"));
        descriptor.addFamily(new HColumnDescriptor("professional"));
        admin.createTable(descriptor);
        System.out.println("Table Created");

    }
}
