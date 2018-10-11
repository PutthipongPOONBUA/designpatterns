package CompositePattern;

import AbstractFactoryPattern.AbstractDuckFactory;
import AbstractFactoryPattern.CoutingDuckFactory;
import AdapterPattern.*;
import Duck.Pigeon;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckCountingFactory = new CoutingDuckFactory();
        simulator.simulate(duckCountingFactory);
    }

    void simulate(AbstractDuckFactory duckFactory)
    {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        Quackable pigeonDuck = new PigeonAdapter(new Pigeon());

        Flock flockDuck = new Flock();
        flockDuck.add(redheadDuck);
        flockDuck.add(duckCall);
        flockDuck.add(rubberDuck);
        flockDuck.add(gooseDuck);
        flockDuck.add(pigeonDuck);

        System.out.println("\nDuck Simulator: Flock");
        simulate(flockDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times \n");
    }

    void simulate(Quackable duck)
    {
        duck.quack();
    }
}
