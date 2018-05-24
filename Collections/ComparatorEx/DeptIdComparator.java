package com.expertzlab.Collections.ComparatorEx;


import java.util.Comparator;

public class DeptIdComparator implements Comparator<Department> {
    public int compare(Department o1, Department o2) {
        Department s1=o1;
        Department s2=o2;

        if(s1.id==s2.id)
            return 0;
        else if(s1.id>s2.id)
            return 1;
        else
            return -1;
    }


}
