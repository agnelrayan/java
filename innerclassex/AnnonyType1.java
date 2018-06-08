package com.expertzlab.innerclassex;
class superClass{
    void doSomething() {
        System.out.println("In Super Class");
    }
}
class AnnonyType1 {
    public static void main(String[] args) {
        superClass anon = new superClass() {
            void doSomething() {
                System.out.println("In Sub Class");
            }
        };
        anon.doSomething();
    }

}