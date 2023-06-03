package org.example.introduction;

/**
 * @author ytq
 * @date 2023/6/3 11:56
 */
public abstract class Duck {
    QuackBehavior quackBehavior;

    FlyBehavior flyBehavior;

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }
}
