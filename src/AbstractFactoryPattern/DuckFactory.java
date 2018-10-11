package AbstractFactoryPattern;

import AdapterPattern.*;
import Duck.DuckCall;
import Duck.MallardDuck;
import Duck.RedheadDuck;
import Duck.RubberDuck;

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
