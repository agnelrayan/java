package com.expertzlab.apps;


import java.lang.reflect.Method;

//import static org.apache.velocity.util.StringUtils.capitalizeFirstLetter;

/**
 * Created by agnel on 4/11/18.
 */
public class AgentDataSetter {
    Class clazz;
    String[] hArray;
    String[] rArray;

    public AgentDataSetter(Class clazz,String[] hArray,String[] rArray){
        this.clazz=clazz;
        this.hArray=hArray;
        this.rArray=rArray;
    }
    public Agent run(){

        Agent agent =null;
        Class<?> loadedClass = null;

        try{
            agent=(Agent) clazz.newInstance();

            for(int i=0;i<hArray.length;i++){

                Method m = clazz.getMethod("set"+capitalizeFirstLetter(hArray[i]),String.class);
            }

        }
        catch(Exception e){
            System.out.println(e);
        }


  return agent;
    }

    public String capitalizeFirstLetter(String str){
        String ch = str.substring(0,1);
        String remStr = str.substring(1);
        String result = ch.toUpperCase()+remStr;
        return result;
    }

}
