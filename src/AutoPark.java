import java.util.ArrayList;
import java.util.List;

public class AutoPark{
    private List<Car> cars;
    public AutoPark(List<Car> cars){
        this.cars = cars;
    }
    public double get_all_price(){
        double sum = 0;
        for (Car car: cars) {
            sum += car.getPrice();
        }
        return sum;
    }
    public void sort_by_fuel_consumption() {
        FuelComparator fuelComparator = new FuelComparator();
        cars.sort(fuelComparator);
    }
    public List<Car> get_car_by_speed(double speed_min, double speed_max){
        List<Car> res_cars = new ArrayList<>();
        for (Car car: cars) {
            if(car.getMax_speed() >= speed_min && car.getMax_speed() <= speed_max){
                res_cars.add(car);
            }
        }
        return res_cars;
    }
    public void show_cars(List<Car> cars){
        for (Car car: cars ) {
            System.out.println(car + "\n");
        }
    }

}
