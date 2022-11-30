package Type_cars;

import Auto.Car;

public class ElectricCar extends Car {
    private double enginePower;
    private double distanceOneCharge;
    public ElectricCar(String manufacturer, String model, int year, double price, double mileage,
                       boolean airConditioning, boolean wasInAccident, double fuelConsumption,
                       double maxSpeed, double enginePower, double distanceOneCharge){

        super(manufacturer, model, year, price,mileage,airConditioning,wasInAccident,fuelConsumption, maxSpeed);
        this.enginePower = enginePower;
        this.distanceOneCharge = distanceOneCharge;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Engine power:           " + enginePower + "\n" +
                "Distance on one charge: " + distanceOneCharge + "\n" +
                "Type:                   electric car";
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }
    public void setDistanceOneCharge(double distanceOneCharge) {
        this.distanceOneCharge = distanceOneCharge;
    }

    public double getEnginePower() {
        return enginePower;
    }
    public double getDistanceOneCharge() {
        return distanceOneCharge;
    }
}
