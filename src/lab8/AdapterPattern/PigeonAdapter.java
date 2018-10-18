package lab8.AdapterPattern;

import lab8.Duck.Pigeon;

public class PigeonAdapter implements Quackable {
    Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon)
    {
        this.pigeon = pigeon;
    }
    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
