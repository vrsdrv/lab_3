package people;

import interfaces.Thing;

public class Prince extends Person {

    public Prince(String name,  Thing thing) {
        super(name);
        this.hold = thing;
    }

    public void give(Person person) {
        System.out.printf("%s дал %s %s\n", this, person, hold);
        person.receive(hold);
        hold = null;
    }
}
