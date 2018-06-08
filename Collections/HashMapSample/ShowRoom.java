package com.expertzlab.Collections.HashMapSample;


import java.util.*;

public class ShowRoom {

    List<Bike> bikeList = new ArrayList();

    public ShowRoom() {
        this.initStoreItems();
       // displayStoreProducts();
    }

    public void initStoreItems() {
        Integer[] bike_id = {1, 2};
        String[] bike_name = {"AG", "AB"};

        for (int i = 0; i < bike_id.length; i++) {
            bikeList.add(new Bike(bike_id[i], bike_name[i]));
        }
       // System.out.println(bikeList);

        Iterator itr = bikeList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    public List<Bike> getBikeList() {
        return bikeList;
    }

    private void displayStoreProducts() {
        List<Bike> bikeList2 = new ShowRoom().getBikeList();
        for (Bike bike : bikeList2) {
            System.out.println("Bike Id:"+bike.getBike_id() + "-" + "Bike Name:"+bike.getBike_name());

        }
    }
    void printCartItems() {
        System.out.println("Print the Item Names:");
        for (Bike bike : bikeList) {
            System.out.println(bike.getBike_name());
        }
    }
    void printCartItemId() {
        System.out.println("Print the Item Ids:");
        for (Bike bike : bikeList) {
            System.out.println(bike.getBike_id());
        }
    }

   /* public void removeProductById(int bike_id) {
       // int bike = getBike_id(bike_id);
        //bikeList.remove(bike);
        System.out.println("AFter Removing Product" + bikeList);
    }*/

    private int getBike_id(int bike_id) {
        return bike_id;
    }

    private static List<String>  createList() {
        return Arrays.asList("iPhone", "Ubuntu", "Android", "Mac OS X");
    }

    private static void fillData(Map<String, String> map) {
        map.put("Android", "Mobile");
        map.put("Eclipse IDE", "Java");
        map.put("Eclipse RCP", "Java");
        map.put("Git", "Version control system");

    }

    private static Map<String, Integer> createMap(Map<String, Integer> map2) {
        map2.put("Eclipse IDE", 0);
        map2.put("Eclipse RCP", 0);
        map2.put("Git", 0);
        map2.put("Net Beans",1);
        return map2;
    }
    public static void main(String[] args) {


        ShowRoom obj = new ShowRoom();
        obj.displayStoreProducts();
        obj.printCartItems();
        obj.printCartItemId();
       // obj.removeProductById(1);

        List<String> l3 = createList();
        System.out.println(l3);

       Map<String,String> map = new HashMap<String, String>();
        fillData(map);
        System.out.println(map);

        Map<String, Integer> map2= new HashMap();
        createMap(map2);
        System.out.println(map2);


    }
}
