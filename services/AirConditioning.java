package services;

public class AirConditioning implements HomeService{
    @Override
    public void turnOn() {
        System.out.println("Air Conditioning is on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Air Conditioning is off.");
    }
}
