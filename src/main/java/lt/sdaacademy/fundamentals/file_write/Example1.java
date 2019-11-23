package lt.sdaacademy.fundamentals.file_write;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;

public class Example1 {
   private static final String OUTPUT_FILE_LOCATION="C:/Users/DELL/IdeaProjects/Pagrindinis/src/lt/sdaacademy/practicalexercises/worker/WorkersData.txt";

   public static void main(String[] args) {
       String tex = "Good morning!";
       writeDataToFile(text);

   }
    private static void writeDataToFile(string data) {
       try(BufferedWriter bw =new (BufferedWriter((BufferedWriter(OUTPUT_FILE_LOCATION))) {
           bw.write(data);
        }catch (FileNotFoundException e) {
           System.out.print ("Failas nerastas");
        }catch(IO)
    }
}
