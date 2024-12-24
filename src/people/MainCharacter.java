package people;

import exceptions.WasLateException;
import interfaces.Thing;
import records.Place;

public class MainCharacter extends Prince{

    public MainCharacter(Thing thing) {
        super("Принц", thing);
    }

    @Override
    public void arriveIn(Place place) {
        if (Math.random() > 0.5) {
            throw new WasLateException(name);
        }
        super.arriveIn(place);
    }
}
