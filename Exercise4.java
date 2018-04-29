package Chapter9Exercise4;

public class Exercise4
{
    /*
    Write a class SportUtilityVehicle that relates to the Car class from
    Self-Check Problems 9 and 10 and whose methods have the following behavior.
    Whenever possible,use inheritance to reuse behavior from the superclasses.
    */

    public static void main(String[] args)
    {
        Car car = new Car();
        SportUtilityVehicle sportUtilityVehicle = new SportUtilityVehicle();

        car.m1();
        car.m2();
        System.out.println(car);

        System.out.println();

        sportUtilityVehicle.m1();
        sportUtilityVehicle.m2();
        System.out.println(sportUtilityVehicle);
    }
}
