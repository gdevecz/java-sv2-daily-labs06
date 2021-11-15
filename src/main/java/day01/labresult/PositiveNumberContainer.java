package day01.labresult;

import java.util.ArrayList;
import java.util.List;

public class PositiveNumberContainer {

    private List<Double> numbers = new ArrayList<>();


    public void addNumber(double d){
        numbers.add(d);
    }

    public List<Double> getNumbers() {
        return numbers;
    }
}
