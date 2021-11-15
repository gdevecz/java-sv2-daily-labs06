package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PositiveNumberContainer pnc = new PositiveNumberContainer();
        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem a pozitív valós számokat!");
        while (pnc.addPositiveReal(sc.nextDouble())) ;
        pnc.printPositiveReals();
    }
}
