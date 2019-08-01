package zadanie1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line="";
        RepitingWords repitingWords = new RepitingWords();
        System.out.println("Podawaj kolejne słowa, a program policzy powtórzenia:");
        do{
            repitingWords.addCounter(line);
            System.out.println("Podaj linię tekstu: (By wyjść wpisz -qiut-)");
            line=sc.nextLine();
        }while (!line.toLowerCase().equals("quit"));
        repitingWords.quitAndList();

    }
}
