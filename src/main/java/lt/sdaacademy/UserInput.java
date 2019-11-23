package lt.sdaacademy;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner inpot = new Scanner(System.in);

        System.out.println("Jusu vardas");
        String name = inpot.nextLine();

        System.out.println("Jusu amzius");
        int age = inpot.nextInt();

        System.out.println("Jusu ugis");
        double tall = inpot.nextDouble();

        System.out.println("vardas " + name);
        System.out.println("amzius " + age);
        System.out.println("ugis " + tall);
    }
}