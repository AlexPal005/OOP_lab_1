package Type_cars;

import Auto.Car;

public class Bus extends Car {
    private int number_passengers;
    public Bus(String manufacturer, String model, int year, double price, double mileage,
               boolean air_conditioning, boolean was_in_accident, double fuel_consumption,
               double max_speed, int number_passengers){

        super(manufacturer, model, year, price,mileage,air_conditioning,was_in_accident,fuel_consumption, max_speed);
        this.number_passengers = number_passengers;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Number of passengers:   " + number_passengers + "\n" +
                "Type:                   bus";
    }

    public void setNumber_passengers(int number_passengers) {
        this.number_passengers = number_passengers;
    }

    public int getNumber_passengers() {
        return number_passengers;
    }
}
