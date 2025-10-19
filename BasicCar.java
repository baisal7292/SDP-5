package Decorator;

public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling basic car features.");
    }

    @Override
    public String getDescription() {
        return "Basic Car";
    }

    @Override
    public double getCost() {
        return 20000.0;
    }
}
