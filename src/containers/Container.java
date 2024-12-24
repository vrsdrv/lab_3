package containers;

import interfaces.Thing;

public abstract class Container implements Thing {

    private String name;

    public Container(String name) {
        this.name = name;
    }

    public abstract Thing open();


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
