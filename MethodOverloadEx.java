/**
 * Created by agnel on 6/2/18.
 */
public class MethodOverloadEx {
    static void add(int a, int b){

        System.out.println("Int a + Int b:"+(a+b));

    }

    static void add(float a,float b){
        System.out.println("Float a + Float b:"+(a+b));

    }

    static void add(int a, float b){
        System.out.println("Int a + Float b :"+(a+b));

    }

    static void add(float a,int b){
        System.out.println("Float a + Int b"+(a+b));


    }

    static void add(Integer a, Integer b){
        System.out.println("Integer a+ Integer b:"+(a+b));
    }

    public static void main(String[] args) {
        add(10,20);
        add(100.1f,(float)200.2);
        add((new Integer(10)),(new Integer(30)));

    }
}
