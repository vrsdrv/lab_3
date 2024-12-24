package containers;

import interfaces.Thing;

public class Nut extends Container{
    private Seed stored;

    public Nut(Seed seedToStore) {
        super("Орех");
        stored = seedToStore;
    }

    @Override
    public Seed open() {
        return stored;
    }
}
