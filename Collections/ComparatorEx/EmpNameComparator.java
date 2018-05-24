package com.expertzlab.Collections.ComparatorEx;


import com.expertzlab.Basics.Employ;

import java.util.Comparator;

public class EmpNameComparator  implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {

          /*  Employee s1=(Employee)o1;
            Employee s2=(Employee) o2;

            return s1.name.compareTo(s2.name);*/

        Employee s1 =(Employee) o1;
        Employee s2 = (Employee) o2;

        return s1.name.compareTo(s2.name);
        }

    }



