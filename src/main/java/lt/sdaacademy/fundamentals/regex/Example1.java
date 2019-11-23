package lt.sdaacademy.fundamentals.regex;

import java.util.function.DoubleToIntFunction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {

    public static void main(String[] args) {

        System.out.println(Pattern.matches(".s", "as"));
        System.out.println(Pattern.matches(".t", "dt"));
        System.out.println(Pattern.matches(".d", "od"));
        System.out.println(Pattern.matches("..d", "oodt"));
        System.out.println(Pattern.matches("..t", "at"));
//el.pasto validacija
        Pattern emailPattern = Pattern.compile("^(.+)@(.+)$");
        Matcher emailMatcher = emailPattern.matcher("deim*.saltis@gmail.com");
        System.out.println(emailMatcher.matches());
    }


    }


