package AbstractFactoryPattern;

import AdapterPattern.QuackCounter;
import AdapterPattern.Quackable;
import DecolatorPattern.QuackEcho;
import Duck.DuckCall;
import Duck.MallardDuck;
import Duck.RedheadDuck;
import Duck.RubberDuck;

public class EchoDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackEcho(new QuackCounter(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackEcho(new QuackCounter(new RedheadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackEcho(new QuackCounter(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackEcho(new QuackCounter(new RubberDuck()));
    }
}
