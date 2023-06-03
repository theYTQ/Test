package org.example.introduction;

/**
 * @author ytq
 * @date 2023/6/3 12:21
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
