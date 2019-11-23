package lt.sdaacademy.fundamentals.objectorentied.bicycle;

public class BicycleMain {

    public static void main (String[]arg){
        Bicycle bike= new Bicycle(75, 2, 20);
        bike.getModel();
        System.out.println(bike.getModel());

        int model=bike.getModel();
        System.out.println("Modelis:" +model);
        System.out.println(Bicycle.count);

        Bicycle anotherBike=new Bicycle(80, 4, 25);
        System.out.println(Bicycle.getCount());

        System.out.println(Bicycle.getCount()==bike.count);
        System.out.println(bike.count==anotherBike.count);
}

}
