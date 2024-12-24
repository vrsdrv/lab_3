package containers;

import interfaces.Thing;
import records.Dress;

public class Seed extends Container{

    private Thing stored;
    private String type;

    public Seed(String type, Thing whatToStore) {
        super("Зерно");
        stored = whatToStore;
        this.type = type;
    }

    @Override
    public Thing open() {
        return stored;
    }

    @Override
    public String toString() {
        return type + " " + getName();
    }
}
