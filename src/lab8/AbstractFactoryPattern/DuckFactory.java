package lab8.AbstractFactoryPattern;

import lab8.AdapterPattern.*;
import lab8.Duck.DuckCall;
import lab8.Duck.MallardDuck;
import lab8.Duck.RedheadDuck;
import lab8.Duck.RubberDuck;

public class DuckFactory extends AbstractDuckFactory { //WithOut Decolator
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
