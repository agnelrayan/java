package com.expertzlab.Collections.LinkedHashSet;

/**
 * Created by Agnel on 17/10/17.
 */
public class LinkedHashSetEx {

    int studId;
    String studName;
    public LinkedHashSetEx(int studId,String studName){
        this.studId=studId;
        this.studName=studName;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LinkedHashSetEx)) return false;

        LinkedHashSetEx that = (LinkedHashSetEx) o;

        if (studId != that.studId) return false;
        return studName.equals(that.studName);

    }

    @Override
    public int hashCode() {
        int result = studId;
        result = 31 * result + studName.hashCode();
        return result;
    }


}
