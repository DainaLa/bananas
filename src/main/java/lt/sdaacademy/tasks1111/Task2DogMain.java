package lt.sdaacademy.tasks1111;

    import java.util.Arrays;
    import java.util.List;
public class Task2DogMain {

    public static void main(String[] args) {
        String[] name = {"Rex", "Bart", "Dolly"};
        int[] age = {2, 4, 7};
        String[] color = {"Brown", "Black", "White"};
        for (int i = 0; i <= name.length - 1; i++) {
            //Dog dog = new Dog(name[i], age[i], color[i]);
            // System.out.println(dog.getName() + " " + dog.getAge() + " years " + dog.getColor());
            List<String> dogList = Arrays.asList(name[i], Integer.toString(age[i]), color[i]);
            dogList.forEach(data ->System.out.print(data + " "));
            System.out.println();
        }
    }
}

