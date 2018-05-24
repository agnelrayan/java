package com.expertzlab.MultithreadEx;

class Table2{
    synchronized void printTable(int n){//method not synchronized
        for(int i=0;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(1500);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }

    }
}

class MyThread3 extends Thread{
    Table t;
    MyThread3(Table t){
        this.t=t;

    }
    public void run(){
        t.printTable(5);
    }

}
class MyThread4 extends Thread{
    Table t;
    MyThread4(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

class TestSynchronization2{
    public static void main(String args[]){
        Table obj = new Table();//only one object
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
        t1.start();
        t2.start();
    }
}