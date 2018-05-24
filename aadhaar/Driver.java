package com.expertzlab.aadhaar;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.JobContext;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import sun.security.jca.GetInstance;

//import java.nio.file.FileSystem;
//import java.nio.file.Path;

/**
 * Created by agnel on 5/19/18.
 */
public class Driver extends Configured implements Tool {
    public int run(String[] args) throws Exception {
        JobContext c;

        if(args.length!=3){
            System.out.println("Usage:[input][output1][output2]");
            System.exit(-1);

        }

        Job stateWiseCount = Job.getInstance(getConf());
        stateWiseCount.setJobName("Adhaar Data Analysis");
        stateWiseCount.setJarByClass(Driver.class);


        //Field separator for Reducer Output


        stateWiseCount.getConfiguration().set("mapreduce.output.textoutputformat.separator","|");


        stateWiseCount.setMapperClass(NumUIDMapper.class);
        stateWiseCount.setReducerClass(NumUIDReducer.class);

        stateWiseCount.setInputFormatClass(TextInputFormat.class);
        stateWiseCount.setMapOutputKeyClass(Text.class);
        stateWiseCount.setMapOutputValueClass(IntWritable.class);

        stateWiseCount.setOutputKeyClass(Text.class);
        stateWiseCount.setOutputValueClass(IntWritable.class);

      //  Path in = new Path(args[0]);

      //  Path out = new Path(args[1]);

      //  FileInputFormat.addInputPath(stateWiseCount,in);
        //FileOutputFormat.setOutputPath(stateWiseCount,out);

       // FileSystem fs = FileSystem.newInstance(getConf());



        return 0;


    }

    public static void main(String[] args) {

    }
}
