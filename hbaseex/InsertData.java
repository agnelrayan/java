package com.expertzlab.hbaseex;
import java.io.IOException;

import org.apache.hadoop.conf.Configuration;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.HTable;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.util.Bytes;

public class InsertData {
    public static void main(String[] args) throws IOException {

        // Instantiating Configuration class
        Configuration config = HBaseConfiguration.create();

        // Instantiating HTable class
        HTable hTable = new HTable(config, "emp2");

        // Instantiating Put class
        // accepts a row name.
        Put p = new Put(Bytes.toBytes("row2"));

        // adding values using add() method
        // accepts column family name, qualifier/row name ,value
        p.add(Bytes.toBytes("address"),
                Bytes.toBytes("name"),Bytes.toBytes("101"));

        p.add(Bytes.toBytes("address"),
                Bytes.toBytes("state"),Bytes.toBytes("Kerala"));

        p.add(Bytes.toBytes("address"),Bytes.toBytes("city"),
                Bytes.toBytes("Tiruvandrum"));

        p.add(Bytes.toBytes("address"),Bytes.toBytes("pin"),
                Bytes.toBytes("6243424"));

        // Saving the put Instance to the HTable.
        hTable.put(p);
        System.out.println("data inserted");

        // closing HTable
        hTable.close();
    }
}
