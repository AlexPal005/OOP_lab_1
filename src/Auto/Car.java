package Auto;

public abstract class Car {
    private String manufacturer;
    private String model;
    private int year;
    private double price;
    private double mileage;
    private boolean airСonditioning;
    private boolean wasInAccident;
    private double fuelConsumption;
    private double maxSpeed;
    public Car(String manufacturer, String model, int year, double price, double mileage,
               boolean airСonditioning, boolean wasInAccident, double fuelConsumption, double maxSpeed){
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
        this.airСonditioning = airСonditioning;
        this.wasInAccident = wasInAccident;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Manufacturer:           " + manufacturer + "\n"+
               "Model:                  " + model + "\n" +
               "Year:                   " + year + "\n" +
               "Price:                  " + price + "\n" +
               "Mileage:                " + mileage + "\n" +
               "Air conditioning:       " + airСonditioning + "\n" +
               "Was in an accident:     " + wasInAccident + "\n" +
               "Fuel consumption:       " + fuelConsumption + "\n" +
                "Max speed:              " + maxSpeed;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    public void setAirСonditioning(boolean airСonditioning) {
        this.airСonditioning = airСonditioning;
    }
    public void setWasInAccident(boolean wasInAccident) {
        this.wasInAccident = wasInAccident;
    }
    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


    public String getManufacturer() {
        return manufacturer;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
    public double getMileage() {
        return mileage;
    }
    public boolean getAirСonditioning(){
        return airСonditioning;
    }
    public boolean getWasInAccident(){
        return wasInAccident;
    }
    public double getFuelConsumption() {
        return fuelConsumption;
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }
}
