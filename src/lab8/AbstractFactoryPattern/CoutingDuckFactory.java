package lab8.AbstractFactoryPattern;

import lab8.AdapterPattern.*;
import lab8.Duck.DuckCall;
import lab8.Duck.MallardDuck;
import lab8.Duck.RedheadDuck;
import lab8.Duck.RubberDuck;

public class CoutingDuckFactory extends AbstractDuckFactory { //Have Decolator
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
