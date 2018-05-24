package com.expertzlab.sample3;

/**
 * Created by agnel on 5/14/18.
 */
public class ArrayOfObjects {
    int id;
    String name;
    public ArrayOfObjects(int id,String name){
        this.id=id;
        this.name=name;
    }
public void display(){
    System.out.println("Id:"+id);
    System.out.println("Name:"+name);
}
    public static void main(String[] args) {
        ArrayOfObjects[] obj = new ArrayOfObjects[4];
       // ArrayOfObjects obj = new ArrayOfObjects(10,"aC");
        obj[0] =new ArrayOfObjects(10,"AG");
        obj[1]=new ArrayOfObjects(20,"AB");
        obj[2]=new ArrayOfObjects(30,"AC");

        for(int i=0;i<obj.length;i++){
            obj[i].display();
            //obj[1].display();
            //obj[2].display();
        }

    }
}
