package lab8.DecolatorPattern;

import lab8.AdapterPattern.*;
import lab8.Duck.*;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate()
    {
        Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redheadDuck = new QuackCounter(new QuackEcho(new RedheadDuck()));
        Quackable duckCall = new QuackCounter(new QuackEcho(new DuckCall()));
        Quackable rubberDuck = new QuackCounter(new QuackEcho(new RubberDuck()));

        System.out.println("\nlab8.Duck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);


        System.out.println("The duck quacked " + QuackCounter.getQuacks() + " times");
    }
    void simulate(Quackable duck)
    {
        duck.quack();
    }

}
