package lab8.DecolatorPattern;

import lab8.AdapterPattern.Quackable;

public class QuackEcho implements Quackable {
    Quackable duck;
    public QuackEcho(Quackable duck)
    {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        System.out.print("ECHO : ");
        duck.quack();
    }
}
