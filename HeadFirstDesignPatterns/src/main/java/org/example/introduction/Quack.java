package org.example.introduction;

/**
 * @author ytq
 * @date 2023/6/3 12:05
 */
public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
