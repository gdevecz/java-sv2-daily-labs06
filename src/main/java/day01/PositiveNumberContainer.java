package day01;

import java.util.ArrayList;
import java.util.List;

public class PositiveNumberContainer {

    private List<Double> positiveReals = new ArrayList<>();


    public boolean addPositiveReal(double d) {
        if (d > 0.0) {
            positiveReals.add(d);
            return true;
        }
        return false;
    }

    public void printPositiveReals() {
        System.out.println("A tárolt számok:");
        for (double d : positiveReals) {
            System.out.println(d);
        }
    }
}
