package Type_cars;

import Auto.Car;

public class Bus extends Car {
    private int numberPassengers;
    public Bus(String manufacturer, String model, int year, double price, double mileage,
               boolean air_conditioning, boolean was_in_accident, double fuel_consumption,
               double max_speed, int numberPassengers){

        super(manufacturer, model, year, price,mileage,air_conditioning,was_in_accident,fuel_consumption, max_speed);
        this.numberPassengers = numberPassengers;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Number of passengers:   " + numberPassengers + "\n" +
                "Type:                   bus";
    }

    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
    }

    public int getNumberPassengers() {
        return numberPassengers;
    }
}
