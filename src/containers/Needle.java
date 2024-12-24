package containers;

import exceptions.DoesNotFitInException;
import records.Dress;

public class Needle {

    private int width;

    public Needle(int width) {
        this.width = width;
    }

    public void fitIn(Dress dress) throws DoesNotFitInException {
        if (dress.thiness()>width){
            throw new DoesNotFitInException();
        }
    }
}
