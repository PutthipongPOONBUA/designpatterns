package lab8.Duck;

import lab8.AdapterPattern.Quackable;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
