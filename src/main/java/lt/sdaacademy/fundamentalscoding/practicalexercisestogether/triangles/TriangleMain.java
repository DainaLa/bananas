package lt.sdaacademy.fundamentalscoding.practicalexercisestogether.triangles;

import sun.awt.image.BufferedImageDevice;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TriangleMain {

    private static final String INPUT_FILE_LOCATION = "C:\\Users\\DELL\\IdeaProjects\\Pagrindinis\\src\\main\\java\\lt\\sdaacademy\\fundamentalscoding\\practicalexercisestogether\\triangles.txt"
    private static final String OUTPUT_FILE_LOCATION = "C:\\Users\\DELL\\IdeaProjects\\Pagrindinis\\src\\main\\java\\lt\\sdaacademy\\fundamentalscoding\\practicalexercisestogether\\triangles.txt"

    public static void main(String[] args) {
        List<Triangle> triangle = getTriangleFromFile();

        countTrianglePerimeter(triangle);
        writeDateToFile(triangle);
    }
    private static List<Triangle> getTriangleFromFile() {
        List<Triangle> triangles = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_LOCATION));
            String line = br.readLine();
            while (line != null) {
                triangles.add(mapDataToModel(line));
                line = br.readLine();

            }
        } catch (IOException e) {
            System.out.println("");
        }
        return triangles;
    }

    private static Triangle mapDataToModel(String lineData) {
        String[] splitedDate = lineData.split(",");
        return new Triangle(
                Integer.parseInt(splitedDate[0]),
                Integer.parseInt(splitedDate[1]),
                Integer.parseInt(splitedDate[2]),
                TrangleType.valueOf(splitedDate[3])
        );
    }

    private static void writeDateToFile(List<Triangle> triangles) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))) {
            for (Triangle t : triangles) {
                bw.write(t.getTriangleType().getTriangleDescription() + t.getPerimeter());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas");
        } catch (IOException e) {
            System.out.println("Ivyko klaida rasant duomenis i faila!");
        }
    }
}