package records;

import interfaces.ICanSurprise;
import people.Person;

import java.util.ArrayList;

public class Place implements ICanSurprise {

    private String name;

    private ArrayList<Person> people;

    public Place(String name, Person ... people) {
        this.name = name;
        this.people = new ArrayList<>();

        for (Person currect: people){
            this.people.add(currect);
        }
    }

    public void add(Person person){
        people.add(person);
        System.out.printf("%s прибыл %s \n", person, name);
    }

    @Override
    public void becomeSurprised(SurpisingType type) {
        for (Person current: people) {
            current.becomeSurprised(type);
        }
        System.out.printf("Другими словами: Все, кто находился в %s %s удивились \n", name, type);
    }
}
