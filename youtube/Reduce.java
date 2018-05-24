package com.expertzlab.youtube;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

/**
 * Created by agnel on 4/16/18.
 */
public class Reduce extends Reducer<Text,IntWritable,Text,IntWritable> {
    public void reduce(Text key,Iterable<IntWritable> values,Context context) throws IOException,InterruptedException{
        int sum=0;
        for(IntWritable val:values){
            sum+=val.get();

        }
        context.write(key,new IntWritable(sum));

    }
}
