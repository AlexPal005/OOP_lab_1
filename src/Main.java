import java.util.ArrayList;
import java.util.List;

// Руденко Олександр
// Варіант 10
// Таксопарк. Определить иерархию легковых автомобилей. Создать таксопарк.
// Посчитать стоимость автопарка. Провести сортировку автомобилей парка по расходу топлива.
// Найти автомобиль в компании, соответствующий заданному диапазону параметров скорости.
public class Main {
    public static void main(String[] args) {
      new Main().start();
    }
    private void start(){
        // lis of cars
        List<Car> cars = new ArrayList<>();
        ElectricCar electric_car = new ElectricCar("Tesla", "model s",2015,
                100000, 50000,true,false, 0,250,386,
                400);
        GasilineCar gasoline_car = new GasilineCar("Volvo", "CR",2010, 10000, 90000,
                true,false, 15, 180,  true, 2);
        Bus bus = new Bus("Volkswagen", "transporter", 2005, 10000,400000,
                true, true,10, 140, 15);
        cars.add(electric_car);
        cars.add(gasoline_car);
        cars.add(bus);

        //Auto park
        AutoPark auto_park = new AutoPark(cars);
        Menu menu = new Menu(auto_park, cars);
        while(true){
            menu.create_menu();
        }
    }
}