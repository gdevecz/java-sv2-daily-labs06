package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PositiveNumberContainer pnc = new PositiveNumberContainer();
        System.out.println("Kérem a pozitív valós számokat!");
        Scanner sc = new Scanner(System.in);
        double d;


        while(pnc.addPositiveReal(sc.nextDouble()));
        pnc.printPositiveReals();
    }
}
