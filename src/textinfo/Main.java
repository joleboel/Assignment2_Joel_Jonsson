package textinfo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logic set = new Logic();
        set.count();
        System.out.println("skriv lite text");
        System.out.println("avsluta genom att skriva stop");
        while(set.runstate()){
            String text = (scan.nextLine());
            set.setText(text);
            System.out.println("Antal tecken " + set.getcharCount());
            System.out.println("Antal rader " + set.getrowCount());

        }

    }

}
//läser in text och skriver ut resultatet

