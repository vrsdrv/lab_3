package people;

import containers.Container;
import containers.Needle;
import exceptions.DoesNotFitInException;
import interfaces.Thing;
import records.Dress;

public class King extends Person {
    private Needle needle;

    public King(Needle needle) {
        super("Король");
        this.needle = needle;
    }

    public void open(){
        if (hold instanceof Container container) {
            Thing containment = container.open();
            System.out.printf("Король открыл %s и достал %s \n", container, containment);
            hold = containment;
        }
    }

    public void tryToFitIn(){
        try {
            System.out.println("Король пытается протянуть платье в иглу");
            needle.fitIn((Dress) hold);
            System.out.println("Получилось");
        } catch (DoesNotFitInException e) {
            System.out.println("Не вышло");
        }

    }
}
