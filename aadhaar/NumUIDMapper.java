package com.expertzlab.aadhaar;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by agnel on 5/19/18.
 */
public class NumUIDMapper extends Mapper<LongWritable,Text,Text,IntWritable> {

    Text state = new Text();
    IntWritable count = new IntWritable();

   // private static final Logger LOG=Logger.getLogger(NumUIDMapper.class);

    public void map(LongWritable key,Text value,Context c) throws IOException, InterruptedException {

        String[] list = value.toString().split(",");

        if(key.get()!=0){
            state.set(list[2]);
            count.set(Integer.parseInt(list[8]));
            c.write(state,count);
        }

      //  LOG.info("Skipped Line with Key:"+key.get());

    }



}
