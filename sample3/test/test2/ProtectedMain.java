package com.expertzlab.sample3.test.test2;

import com.expertzlab.sample3.test.ProtectedEx;

/**
 * Created by agnel on 5/15/18.
 */
public class ProtectedMain extends ProtectedEx  {
    public static void main(String[] args) {
        ProtectedMain  obj = new ProtectedMain();
        obj.id=10;
        obj.name="Ag";
        obj.display();
    }
}