package Decorator;

public class ComfortPackage extends CarDecorator {

    public ComfortPackage(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Comfort Package features.");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Comfort Package";
    }

    @Override
    public double getCost() {
        return super.getCost() + 3000.0;
    }
}
