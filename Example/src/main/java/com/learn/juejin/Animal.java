package com.learn.juejin;

import com.learn.effectivejava.NyPizza;
import com.learn.effectivejava.Pizza;

public class Animal {
    public String name() {
        return "Animal";
    }

    public static void main(String[] args) {

    }
}

class Dog extends Animal {
    public String name() {
        return "Dog";
    }
}

class Cat extends Animal {
    public String name() {
        return "Cat";
    }
}
