package com.expertzlab.aadhaar;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * Created by agnel on 5/19/18.
 */
public class NumUIDReducer extends Reducer<Text,IntWritable,Text,IntWritable> {
    public void reduce(Text key, Iterable<IntWritable> values,Context c) throws IOException, InterruptedException {

        int sum=0;

        for(IntWritable count:values){
            sum = sum+count.get();
        }

        c.write(key,new IntWritable(sum));



    }
}
