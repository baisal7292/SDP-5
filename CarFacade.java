package Facade;

import Decorator.Car;
import Decorator.ClimateControl;

public class CarFacade {
    private Engine engine;
    private Transmission transmission;
    private ClimateControl climateControl;
    private NavigationSystem navigationSystem;
    private Infotainment infotainment;
    private Car car; // базовая или декорированная машина

    public CarFacade(Car car) {
        this.car = car;
        this.engine = new Engine();
        this.transmission = new Transmission();
        this.climateControl = new ClimateControl();
        this.navigationSystem = new NavigationSystem();
        this.infotainment = new Infotainment();
    }

    public void startCar() {
        System.out.println("\n=== Starting the car ===");
        engine.start();
        transmission.shiftToDrive();
        climateControl.setTemperature(22);
        navigationSystem.startNavigation();
        infotainment.playMusic();
        car.assemble();
        System.out.println("Decorator.Car is ready to go!\n");
    }

    public void stopCar() {
        System.out.println("=== Stopping the car ===");
        infotainment.stopMusic();
        navigationSystem.stopNavigation();
        transmission.shiftToPark();
        engine.stop();
        System.out.println("Decorator.Car is turned off.\n");
    }
}
