package people;

import interfaces.ICanSurprise;
import interfaces.Thing;
import records.Place;

public class Person implements ICanSurprise {

    protected String name;
    protected Thing hold;

    public Person(String name) { //передаем имя и статус в конструкторе
        this.name = name;
    }

    @Override
    public void becomeSurprised(SurpisingType type) {
        System.out.printf("%s %s удивился\n", name, type);
    }

    public void receive(Thing thing){
        hold = thing; //даем какую-то вещь в нашем случаем платье королю
    }

    public void arriveIn(Place place) {
        place.add(this); //прибывать в дом
    }

    @Override
    public String toString() {
        return "%s ".formatted(name);
    }


}
