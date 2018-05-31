package com.expertzlab.interfaceex;

/**
 * Created by agnel on 2/23/18.
 */
class PrivateDemo {
    private String name;
    int id;

    public PrivateDemo(String name, int id) {
        //System.out.println();
        this.id = id;
        this.name = name;
    }

    protected void display() {
        System.out.println(name);
        System.out.println(id);

    }
}

    public class PrivateEx {
        public static void main(String[] args) {
            PrivateDemo obj = new PrivateDemo("AG", 20);
            obj.display();
            obj.id=10;

        }

    }



