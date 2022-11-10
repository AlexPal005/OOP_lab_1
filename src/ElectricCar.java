public class ElectricCar extends Car{
    private double engine_power;
    private double distance_one_charge;
    public ElectricCar(String manufacturer, String model, int year, double price, double mileage,
                       boolean air_conditioning, boolean was_in_accident, double fuel_consumption,
                       double max_speed, double engine_power, double distance_one_charge){

        super(manufacturer, model, year, price,mileage,air_conditioning,was_in_accident,fuel_consumption, max_speed);
        this.engine_power = engine_power;
        this.distance_one_charge = distance_one_charge;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Engine power:           " + engine_power + "\n" +
                "Distance on one charge: " + distance_one_charge + "\n" +
                "Type:                   electric car";
    }

    public void setEngine_power(double engine_power) {
        this.engine_power = engine_power;
    }
    public void setDistance_one_charge(double distance_one_charge) {
        this.distance_one_charge = distance_one_charge;
    }

    public double getEngine_power() {
        return engine_power;
    }
    public double getDistance_one_charge() {
        return distance_one_charge;
    }
}
