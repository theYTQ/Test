package org.example.introduction;

/**
 * @author ytq
 * @date 2023/6/3 12:11
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
