package com.expertzlab.Collections.ComparatorEx;

import java.util.Comparator;

public class EmpIdComparator implements Comparator<Employee> {
    public int compare(Employee obj1, Employee obj2) {
        Employee s1 = (Employee)obj1;
        Employee s2 = (Employee)obj2;

        if(s1.id==s2.id) {
            return 0;
        }
            else if(s1.id>s2.id) {

            return 1;
        }
            else
                return -1;

        }
    }

