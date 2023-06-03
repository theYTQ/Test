package org.example.introduction;

/**
 * @author ytq
 * @date 2023/6/3 12:12
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
