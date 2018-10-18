package lab8.AbstractFactoryPattern;

import lab8.AdapterPattern.QuackCounter;
import lab8.AdapterPattern.Quackable;
import lab8.DecolatorPattern.QuackEcho;
import lab8.Duck.DuckCall;
import lab8.Duck.MallardDuck;
import lab8.Duck.RedheadDuck;
import lab8.Duck.RubberDuck;

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
