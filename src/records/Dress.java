package records;

import interfaces.Thing;

public record Dress(int thiness, String description) implements Thing {

    @Override
    public String getName() {
        return "Платье";
    }
}
