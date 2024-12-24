import containers.Needle;
import containers.Nut;
import containers.Seed;
import exceptions.WasLateException;
import interfaces.ICanSurprise;
import people.King;
import people.MainCharacter;
import people.Prince;
import records.Dress;
import records.Place;
import java.lang.Math;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dress dress1 = new Dress(10, "тончайшее");
        Dress dress2 = new Dress(10, "тончайшее");
        Needle needle = new Needle(8);

        Prince brother1 = new Prince("Брат1", dress1);
        Prince brother2 = new Prince("Брат2", dress2);
        King king = new King(needle);

        Place house = new Place("дом", brother1, brother2, king);

        Dress mainDress = new Dress(6, "самое тонкое");
        Seed seedPsh = new Seed("пшеничное", mainDress);
        Seed seedBob = new Seed("бобовое", seedPsh);
        Nut nut = new Nut(seedBob);

        Prince prince = new MainCharacter(nut);

        try {
            prince.arriveIn(house);

            brother1.give(king);
            king.tryToFitIn();


            brother2.give(king);
            king.tryToFitIn();

            prince.give(king);
            house.becomeSurprised(ICanSurprise.SurpisingType.MIDDLE);
            king.open();
            king.open();
            prince.becomeSurprised(ICanSurprise.SurpisingType.MIDDLE);
            king.open();

            house.becomeSurprised(ICanSurprise.SurpisingType.STRONG);
            king.tryToFitIn();
        } catch (WasLateException e) {
            System.out.println(e.getMessage());
            System.out.println("Король посмотрел на сыновей своих и решил отдать свое царство второму брату.");
            System.out.println("А младщий принц остался ни с чем. И хеппи энда для него не было.....");
        }
    }
}