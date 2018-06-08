package com.expertzlab.youtube;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * Created by agnel on 4/16/18.
 */
public class Map extends Mapper<LongWritable,Text,Text,IntWritable>{
    private Text category =new Text();
    private final static IntWritable one = new IntWritable(1);

    public void map(LongWritable key,Text value,Context context) throws IOException,InterruptedException{
        String line = value.toString();
        String str[] = line.split("\t");

        if(str.length>5){
            category.set(str[3]);
        }
        context.write(category,one);

    }


}
