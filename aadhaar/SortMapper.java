package com.expertzlab.aadhaar;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * Created by agnel on 5/19/18.
 */
public class SortMapper extends Mapper<LongWritable,Text,Text,IntWritable> {
    Text state = new Text();
    IntWritable count = new IntWritable();

    public void map(LongWritable key,Text value, Context c) throws IOException, InterruptedException {

        String[] splits = value.toString().split("\\|");

        state.set(splits[0].trim());
        count.set(Integer.parseInt(splits[1].trim()));
        c.write(state,count);

    }
}
