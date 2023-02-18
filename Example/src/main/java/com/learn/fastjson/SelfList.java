package com.learn.fastjson;

public class SelfList<E> {
    public static void main(String[] args) {
        SelfList<String> a = new SelfList<String>();
        a.add("123");
        int num = a.get(123);
        //这里创建的时候指定了Integer
        SelfList<Integer> b = new SelfList<Integer>();
        b.add(123);
    }

    public void add(E e) {
        if (e instanceof String) {
            System.out.println("I am String");
        } else if (e instanceof Integer) {
            System.out.println("I am Integer");
        }
    }

    public <T> T get(T t) {
        return t;
    }

}
