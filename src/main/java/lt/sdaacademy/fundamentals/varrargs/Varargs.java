package lt.sdaacademy.fundamentals.varrargs;

public class Varargs {

        public static void main (String[] args){
            System.out.println(sum(1, 2, 3, 4));
            System.out.print(sum(1));
            System.out.println(sum());

        }
    private static int sum(int... elements) { //gali buti 0 arba daug kintamuju, gali buti tik vienas kintamasis funkcijos parametrams
        int result = 0;

        for (int i : elements) {
            result += i;
        }
        return result;
    }

    }



