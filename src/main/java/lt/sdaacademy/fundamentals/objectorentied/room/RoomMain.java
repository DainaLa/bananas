package lt.sdaacademy.fundamentals.objectorentied.room;

import java.util.Scanner;

public class RoomMain {
    public static void main (String[] args){

    Scanner scaner = new Scanner( System.in);

    System.out.println("iveskite kambario ilgi");
    int whidth = scaner.nextInt();

      System.out.println("iveskite kambario ploti");
    int length = scaner.nextInt();

        Room room = new Room(whidth, length);

    int squareofRoom = getSqureOfRoom(room.getLength(), room.getWidth());
    System.out.println("Kambario plotas:" + squareofRoom);
}

    private static int getSqureOfRoom(int length, int whidth) {
        return (length * whidth);
    }
}

