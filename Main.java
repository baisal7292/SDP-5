import Decorator.BasicCar;
import Decorator.Car;
import Decorator.ComfortPackage;
import Facade.CarFacade;
import Decorator.LuxuryPackage;
import Facade.PrestigePackage;

public class Main {
    public static void main(String[] args) {

        Car basicCar = new BasicCar();

        Car prestigeCar = new PrestigePackage(
                new LuxuryPackage(
                        new ComfortPackage(basicCar)));

        CarFacade facade = new CarFacade(prestigeCar);


        facade.startCar();
        facade.stopCar();
    }
}
