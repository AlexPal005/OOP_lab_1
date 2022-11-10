public class Car {
    private String manufacturer;
    private String model;
    private int year;
    private double price;
    private double mileage;
    private boolean air_conditioning;
    private boolean was_in_accident;
    private double fuel_consumption;
    private double max_speed;
    public Car(String manufacturer, String model, int year, double price, double mileage,
               boolean air_conditioning, boolean was_in_accident, double fuel_consumption, double max_speed){
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.price = price;
        this.mileage = mileage;
        this.air_conditioning = air_conditioning;
        this.was_in_accident = was_in_accident;
        this.fuel_consumption = fuel_consumption;
        this.max_speed = max_speed;
    }

    @Override
    public String toString() {
        return "Manufacturer:           " + manufacturer + "\n"+
               "Model:                  " + model + "\n" +
               "Year:                   " + year + "\n" +
               "Price:                  " + price + "\n" +
               "Mileage:                " + mileage + "\n" +
               "Air conditioning:       " + air_conditioning + "\n" +
               "Was in an accident:     " + was_in_accident + "\n" +
               "Fuel consumption:       " + fuel_consumption + "\n" +
                "Max speed:              " + max_speed;
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
    public void setAir_conditioning(boolean air_conditioning) {
        this.air_conditioning = air_conditioning;
    }
    public void setWas_in_accident(boolean was_in_accident) {
        this.was_in_accident = was_in_accident;
    }
    public void setFuel_consumption(double fuel_consumption) {
        this.fuel_consumption = fuel_consumption;
    }
    public void setMax_speed(double max_speed) {
        this.max_speed = max_speed;
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
    public boolean getAir_conditioning(){
        return air_conditioning;
    }
    public boolean getWas_in_accident(){
        return was_in_accident;
    }
    public double getFuel_consumption() {
        return fuel_consumption;
    }
    public double getMax_speed() {
        return max_speed;
    }
}
