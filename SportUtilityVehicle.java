package Chapter9Exercise4;

public class SportUtilityVehicle extends Car
{
    public void m1()
    {
        System.out.println("SUV 1");
    }

    public void m2()
    {
        System.out.println("S-car 1");
    }

    @Override
    public String toString() {
        return "SUV vroom";
    }
}
