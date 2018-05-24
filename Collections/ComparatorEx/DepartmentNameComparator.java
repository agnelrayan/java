package com.expertzlab.Collections.ComparatorEx;

import java.util.Comparator;

/**
 * Created by geo on 11/1/18.
 */
public class DepartmentNameComparator implements Comparator<Department>
     {
        public int compare(Department o1, Department o2) {

          /*  Employee s1=(Employee)o1;
            Employee s2=(Employee) o2;

            return s1.name.compareTo(s2.name);*/

            Department s1 =(Department) o1;
            Department s2 = (Department) o2;

            //return s1.name.compareTo(s2.name);
            return s1.name.compareTo(s2.name);
        }
}
