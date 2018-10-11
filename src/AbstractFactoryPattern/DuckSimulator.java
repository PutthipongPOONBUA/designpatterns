package AbstractFactoryPattern;

import AdapterPattern.Goose;
import AdapterPattern.GooseAdapter;
import AdapterPattern.QuackCounter;
import AdapterPattern.Quackable;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new DuckFactory();
        AbstractDuckFactory duckCountingFactory = new CoutingDuckFactory();
        AbstractDuckFactory duckEchoFactory = new EchoDuckFactory();

        System.out.println("-----Without Decolator-----");
        simulator.simulate(duckCountingFactory);
        System.out.println("-----Counter Decolator-----");
        simulator.simulate(duckFactory);
        System.out.println("-----Echo Decolator-----");
        simulator.simulate(duckEchoFactory);
    }
    void simulate(AbstractDuckFactory duckFactory)
    {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator: With Abstract Factory");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    void simulate(Quackable duck)
    {
        duck.quack();
    }
}
