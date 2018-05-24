package com.expertzlab.aadhaar;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

/**
 * Created by agnel on 5/19/18.
 */
public class SortComparator extends WritableComparator {
    public int compare(WritableComparable k1,WritableComparable k2){

        IntWritable v1 =(IntWritable) k1;
        IntWritable v2 = (IntWritable) k2;

        return (v1.get()<v2.get())?(1):(v1.get()==v2.get())?0:-1;

    }

    /*protected sortComparator(){

        super(IntWritable.class,true);
    }*/
}
