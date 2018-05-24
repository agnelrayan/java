package com.expertzlab.inheritance;

public class ModifierEx2
{
    private int count;

    public ModifierEx2(int x){
        this.count=x;
    }

    public void testPrivate(ModifierEx2 o){
        System.out.println(o.count);
    }

    public static void main(String[] args) {
        ModifierEx2 obj = new ModifierEx2(10);
        obj.testPrivate(obj);

    }
}