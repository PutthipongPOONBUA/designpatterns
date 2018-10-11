package AbstractFactoryPattern;

import AdapterPattern.*;
import Duck.DuckCall;
import Duck.MallardDuck;
import Duck.RedheadDuck;
import Duck.RubberDuck;

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
