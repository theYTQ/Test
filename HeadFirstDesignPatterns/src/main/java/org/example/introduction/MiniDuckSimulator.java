package org.example.introduction;

/**
 * @author ytq
 * @date 2023/6/3 12:13
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallar = new MallarDuck();
        mallar.performFly();
        mallar.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
