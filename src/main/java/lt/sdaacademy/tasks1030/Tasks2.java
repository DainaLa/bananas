package lt.sdaacademy.tasks1030;

import java.util.Scanner;

public class Tasks2 {
    public static void main(String args[]) {

        Scanner vartotojas = new Scanner(System.in);
        System.out.println("Parasykite skaiciu");
        int skaicius = vartotojas.nextInt();

        int daliklis1 = 2;
        int daliklis2 = 3;
        int daliklis3 = 5;
        int daliklis4 = 7;
        int remaider1 = skaicius % daliklis1;
        int remaider2 = skaicius % daliklis2;
        int remaider3 = skaicius % daliklis3;
        int remaider4 = skaicius % daliklis4;

    if ( skaicius==2 || skaicius==3 || skaicius==5 || skaicius==7){
        System.out.print("Jusu parasytas skaicius yra pirminis");
    } else if (skaicius == 0 || skaicius==1) {
        System.out.print("Jusu parasytas skaicius nei sudetinis nei pirminis");
        } else if (remaider1==0 || remaider2 == 0 || remaider3 == 0 || remaider4==0) {
            System.out.print("Jusu parasytas skaicius yra lyginis");
        } else if (remaider1 > 0 || remaider2 > 0 || remaider3 > 0 || remaider4 > 0)  {
            System.out.print("Jusu parasytas skaicius yra pirminis");



        }
    }
}





