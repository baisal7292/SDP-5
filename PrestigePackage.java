package Facade;

import Decorator.Car;
import Decorator.CarDecorator;

public class PrestigePackage extends CarDecorator {
    public PrestigePackage(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Prestige Package (leather seats, safety assist)";
    }

    @Override
    public double getCost() {
        return super.getCost() + 5000.0;
    }
}
