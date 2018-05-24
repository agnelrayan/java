package com.expertzlab.Collections.ArrayListSamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by geo on 31/1/18.
 */
public class Demo {
    public static void main(String[] args) {

        List<String> lines = Arrays.asList("spring", "node", "mkyong");
        List<String> result = getFilterOutput(lines, "ag");
        for (String temp : result) {
            System.out.println(temp);    //output : spring, node
        }

    }

    private static List<String> getFilterOutput(List<String> lines, String filter) {
        List<String> result = new ArrayList();

        for (String line : lines) {
            if (!"ag".equals(line)) { // we dont like mkyong
                result.add(line);
            }
        }
        return result;
    }
}
