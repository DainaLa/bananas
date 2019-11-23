package lt.sdaacademy.calculator;

import com.sun.corba.se.impl.encoding.CDROutputObject;
import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import javax.swing.*;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {

        Scanner actionScanner = new Scanner(System.in);
        double result;
        boolean calculate = true;
        while (calculate) {


         //   System.out.println("ivesk pirma skaiciu");
        //    double firstNum = numberScanner.nextDouble();
            double firstNum = getNum( "Iveskite pirma skaiciu");
            double secondNum = getNum( "Iveskite antra skaiciu");
        //    System.out.println("ivesk antra skaiciu");
           // double secondNum = numberScanner.nextDouble();

            System.out.println("koki veiksma norite atlikti; + - / *");
            String action = actionScanner.nextLine();

            result = getResult(action, firstNum, secondNum);
            System.out.println(result);
        }
        System.out.println("Ar norite skaiciuoti toliau? Taip: Ne");
        String answer = actionScanner.nextLine();
        if (answer.equals("Ne") || answer.toLowerCase().equals("Ne")) {
            calculate = false;
        }
    }



    private static double getNum( String message) {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println(message);
        double number = numberScanner.nextDouble();
        return number;
    }

    private static double getResult(String action, double num1, double num2) {
        switch (action) {
            case ("+"): {
                return (num1 + num2);
            }
            case ("-"): {
                return num1 - num2;
            }
            case ("*"): {
                return num1 * num2;
            }
            case ("/"): {
                return num1 / num2;
            }
            default: {
                System.out.println("Veiksmas nerastas");
                return 0;
            }
        }

    }
}

