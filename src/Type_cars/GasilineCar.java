package Type_cars;

import Auto.Car;

public class GasilineCar extends Car {
    private boolean automatic_transmission;
    private double engine_capacity;
    public GasilineCar(String manufacturer, String model, int year, double price, double mileage,
                       boolean air_conditioning, boolean was_in_accident, double fuel_consumption, double max_speed,
                       boolean automatic_transmission, double engine_capacity){

        super(manufacturer, model, year, price,mileage,air_conditioning,was_in_accident,fuel_consumption, max_speed);
        this.automatic_transmission = automatic_transmission;
        this.engine_capacity = engine_capacity;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Automatic transmission: " + automatic_transmission + "\n" +
                "Engine capacity:        " + engine_capacity + "\n" +
                "Type:                   gasoline car";
    }

    public void setAutomatic_transmission(boolean automatic_transmission) {
        this.automatic_transmission = automatic_transmission;
    }
    public void setEngine_capacity(double engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    public boolean getAutomatic_transmission(){
        return automatic_transmission;
    }
    public double getEngine_capacity() {
        return engine_capacity;
    }
}
