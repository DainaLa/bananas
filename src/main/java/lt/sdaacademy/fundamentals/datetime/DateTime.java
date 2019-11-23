package lt.sdaacademy.fundamentals.datetime;


import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.YEAR;

public class DateTime {
    public static void main (String[] args ) {

   long millis=System.currentTimeMillis();
  Date now = new Date(millis);
   System.out.println(now);

   Calendar cal = Calendar.getInstance();
   Date date = cal.getTime();
   cal.setTime(now);
        cal.setTime(now);

   System.out.println(date);

   System.out.print(Calendar.YEAR);
   System.out.print(Calendar.DAY_OF_YEAR);
   System.out.print(Calendar.WEEK_OF_YEAR);

  /* String dateInText="2019;02;18"
        LoscalDate LoscalDate = LoscalDate.parse(dateInText);
   System.out.println(LocalDate);*/


    }
}



