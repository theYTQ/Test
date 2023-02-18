package com.learn.demo;

import org.openjdk.jol.info.ClassLayout;

public class ObjectDemo {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(ClassLayout.parseInstance(obj).toPrintable());

        Object arrObj = new int[1];
        System.out.println(ClassLayout.parseInstance(arrObj).toPrintable());

        Object intObj = new IntObject();
        System.out.println(ClassLayout.parseInstance(intObj).toPrintable());
    }
}

class IntObject {
    int i;
}
