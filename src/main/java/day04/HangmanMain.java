package day04;

import java.util.Scanner;

public class HangmanMain {

    public static void main(String[] args) {
        new HangmanMain().run();
    }

    private void run() {
        String wordToFind = "alma";
        String wordFound = getWordFound(wordToFind.length());
        int chances = 8;

        while(!(wordToFind.equals(wordFound)) && chances > 0) {
            printActalCondition(wordFound,chances);
            String guess = askAChar();
            if(wordToFind.contains(guess)) {
                wordFound = updateWordFound(wordToFind, wordFound, guess);
            } else {
                chances--;
            }
        }
        if(chances>0) {
            System.out.println("Gratulálok!");
        } else {
            System.out.println("Sajnos nem sikeült kitalálnod a(z) " + wordToFind +" szót.");
        }


    }

    private String updateWordFound(String wordToFind, String status, String guess) {
        char[] chars = status.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (wordToFind.charAt(i) == guess.charAt(0)) {
                chars[i] = guess.charAt(0);
            }
        }
        return new String(chars);
    }

    private String getWordFound(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append("_");
        }
        return sb.toString();
    }

    private String askAChar(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Mi a következő tipped? ");
        return Character.toString(sc.nextLine().charAt(0));
    }

    private void printActalCondition(String wordFound, int chances){
        System.out.println("Itt tartunk: "+ wordFound);
        System.out.println("Lehetőségeid: "+ chances);
    }

}