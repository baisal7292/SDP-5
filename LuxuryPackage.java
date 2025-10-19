package Decorator;

public class LuxuryPackage extends CarDecorator {

    public LuxuryPackage(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Luxury Package features (leather interior, premium sound system).");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Luxury Package";
    }

    @Override
    public double getCost() {
        return super.getCost() + 5000.0;
    }
}
