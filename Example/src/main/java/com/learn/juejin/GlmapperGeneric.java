package com.learn.juejin;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class GlmapperGeneric<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        // 不会报错
        countLegs( dogs );
        // 报错
        //countLegs1(dogs);
    }

    public static void noSpecifyType() {
        GlmapperGeneric glmapperGeneric = new GlmapperGeneric();
        glmapperGeneric.set("test");
        String test = (String) glmapperGeneric.get();
        System.out.println(test);
    }

    public static void specifyType() {
        GlmapperGeneric<String> glmapperGeneric = new GlmapperGeneric<>();
        glmapperGeneric.set("test");
        String test = (String) glmapperGeneric.get();
        System.out.println(test);
    }

    static String countLegs (List<? extends Animal> animals ) {
        String s = "";
        for ( Animal animal : animals )
        {
            s += animal.name();
        }
        return s;
    }
    // 范围定死
    static String countLegs1 (List<Animal> animals ){
        String s = "";
        for ( Animal animal : animals )
        {
            s += animal.name();
        }
        return s;
    }
}
