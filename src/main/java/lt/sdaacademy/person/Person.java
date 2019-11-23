package lt.sdaacademy.person;

import org.omg.CORBA.WStringSeqHelper;

import java.util.Scanner;

public class Person {
    String name ;
    int age;
    double tall;

    public Person(String n, int a, double t) {
        name = n;
        age = a;
        tall = t;
        Scanner Person = new Scanner(System.in);

        System.out.println("Iveskite savo varda");
        name = Person.nextLine();

        System.out.println("Iveskite savo amziu");
        age = Person.nextInt();

        System.out.println("Iveskite savo ugi");
        tall = Person.nextDouble();

        System.out.println("Jusu vardas yra "+ name);
        System.out.println("Jusu ugis yra "+age);
        System.out.println("Jusu ugis yra "+tall);
    }

}



