package com.expertzlab.Collections.HashMapSample;


import java.util.ArrayList;
import java.util.List;

public class Bike {
    int bike_id;
    String bike_name;
    @Override
    public String toString() {
        return "Bike{" +
                "bike_id=" + bike_id +
                ", bike_name='" + bike_name + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bike)) return false;

        Bike bike = (Bike) o;

        if (getBike_id() != bike.getBike_id()) return false;
        return getBike_name() != null ? getBike_name().equals(bike.getBike_name()) : bike.getBike_name() == null;

    }

    @Override
    public int hashCode() {
        int result = getBike_id();
        result = 31 * result + (getBike_name() != null ? getBike_name().hashCode() : 0);
        return result;
    }



    public Bike(int bike_id, String bike_name) {
        this.bike_id = bike_id;
        this.bike_name = bike_name;
    }



    public String getBike_name() {
        return bike_name;
    }

    public void setBike_name(String bike_name) {
        this.bike_name = bike_name;
    }

    public int getBike_id() {
        return bike_id;
    }

    public void setBike_id(int bike_id) {
        this.bike_id = bike_id;
    }

    public void orderBike(int bike_id){
        List<Integer> li = new ArrayList<Integer>();
        li.add(10);
        li.add(20);
    }




}
