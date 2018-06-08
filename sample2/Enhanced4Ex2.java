package com.expertzlab.sample2;

/**
 * Created by agnel on 5/16/18.
 */
public class Enhanced4Ex2 {
    public static void main(String[] args) {
        User[] user = new User[2];
        user[0] = new User("Ag",10);
        user[1] = new User("AB",20);

        for(User el:user){
            System.out.println(el);
        }

    }
}

class User{
    String name;
    int id;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }



    public User(String name,int id){
        this.name=name;
        this.id=id;

    }



}
