package lt.sdaacademy.tasks1111;

public class Refactored {

    public class Dog {
        private String name;
        private int age;
        private String color;

        public Dog(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

    }
}
