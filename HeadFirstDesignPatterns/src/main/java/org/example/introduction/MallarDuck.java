package org.example.introduction;

/**
 * @author ytq
 * @date 2023/6/3 12:04
 */
public class MallarDuck extends Duck {
    public MallarDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
