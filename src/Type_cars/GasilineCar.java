package Type_cars;

import Auto.Car;

public class GasilineCar extends Car {
    private boolean automaticTransmission;
    private double engineCapacity;
    public GasilineCar(String manufacturer, String model, int year, double price, double mileage,
                       boolean air_conditioning, boolean was_in_accident, double fuel_consumption, double max_speed,
                       boolean automaticTransmission, double engineCapacity){

        super(manufacturer, model, year, price,mileage,air_conditioning,was_in_accident,fuel_consumption, max_speed);
        this.automaticTransmission = automaticTransmission;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Automatic transmission: " + automaticTransmission + "\n" +
                "Engine capacity:        " + engineCapacity + "\n" +
                "Type:                   gasoline car";
    }

    public void setAutomaticTransmission(boolean automaticTransmission) {
        this.automaticTransmission = automaticTransmission;
    }
    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public boolean getAutomaticTransmission(){
        return automaticTransmission;
    }
    public double getEngineCapacity() {
        return engineCapacity;
    }
}
