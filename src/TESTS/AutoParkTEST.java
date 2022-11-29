package TESTS;

import Auto.*;
import Type_cars.Bus;
import Type_cars.ElectricCar;
import Type_cars.GasilineCar;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class AutoParkTEST {
    private AutoPark auto_park;
    private void create_list(){
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
        auto_park = new AutoPark(cars);
    }
    @Test
    public void test_all_price(){
        create_list();
        assertEquals(120000,auto_park.get_all_price(), 0.001);
    }
    @Test
    public void test_sort(){
        create_list();
        List<Car> cars_sorted = new ArrayList<>();
        ElectricCar electric_car = new ElectricCar("Tesla", "model s",2015,
                100000, 50000,true,false, 0,250,386,
                400);
        GasilineCar gasoline_car = new GasilineCar("Volvo", "CR",2010, 10000, 90000,
                true,false, 15, 180,  true, 2);
        Bus bus = new Bus("Volkswagen", "transporter", 2005, 10000,400000,
                true, true,10, 140, 15);
        cars_sorted.add(electric_car);
        cars_sorted.add(bus);
        cars_sorted.add(gasoline_car);

        //sort
        auto_park.sort_by_fuel_consumption();
        for (int i = 0; i < cars_sorted.size(); i++) {
            assertEquals(cars_sorted.get(i).getManufacturer(),
                    auto_park.getCars().get(i).getManufacturer()
            );
        }

    }
    @Test
    public void test_get_by_speed(){
        create_list();
        List<Car> cars = new ArrayList<>();
        // test speed 300-400
        for (int i = 0; i < cars.size(); i++) {
            assertEquals(cars.get(i).getManufacturer(),
                    auto_park.get_car_by_speed(300,400).get(i).getManufacturer()
            );
        }
        ElectricCar electric_car = new ElectricCar("Tesla", "model s",2015,
                100000, 50000,true,false, 0,250,386,
                400);
        cars.add(electric_car);
        // test speed 200-300
        for (int i = 0; i < cars.size(); i++) {
            assertEquals(cars.get(i).getManufacturer(),
                    auto_park.get_car_by_speed(200,300).get(i).getManufacturer()
            );
        }
    }
}
