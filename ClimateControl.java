package Decorator;

public class ClimateControl {
    public void setTemperature(int degrees) {
        System.out.println("Climate set to " + degrees + "°C.");
    }

    public void turnOff() {
        System.out.println("Climate system turned off.");
    }
}
