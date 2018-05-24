package com.expertzlab.aadhaar;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * Created by agnel on 5/19/18.
 */
public class SortReducer extends Reducer<IntWritable, Text,Text,IntWritable> {

    public void reduce(IntWritable key,Iterable<Text> values,Context c){

        for(Text val:values){
            try {
                c.write(val,key);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}
