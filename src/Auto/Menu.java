package Auto;

import java.util.List;
import java.util.Scanner;

public class Menu {
    private AutoPark autoPark;
    private List<Car> cars;
    private Scanner in;
    public Menu(AutoPark autoPark, List<Car> cars){
        this.autoPark = autoPark;
        this.cars = cars;
        in = new Scanner(System.in);
    }
    public void create_menu(){
        display_menu();
        int number_menu = in.nextInt();
        in.nextLine();
        switch(number_menu){
            case(1):
                first();
                break;
            case(2):
                second();
                break;
            case(3):
                third();
                break;
            case(4):
                fourth();
                break;
            default:
                System.out.println("Помилка! Уведіть номер пункту меню!");
                break;
        }
    }
    private void display_menu() {
        System.out.println();
        System.out.println("-------------Меню--------------");
        System.out.println("1. Порахувати вартість автопарку");
        System.out.println("2. Відсортувати автомобілі за витратою палива");
        System.out.println("3. Знайти автомобілі з максимальною швидкістю в заданому діапазоні");
        System.out.println("4. Показати список автомобілів");
        System.out.print("Оберіть номер меню: ");
    }
    private void first(){
        System.out.println("Вартість автопарку: " + autoPark.get_all_price() + "$");
    }
    private void second(){
        autoPark.sort_by_fuel_consumption();
        System.out.println("Відсортований список автомобілів: ");
        autoPark.show_cars(cars);
    }
    private void third(){
        System.out.println("Уведіть початкове значення діапазону швидкості: ");
        double min = in.nextDouble();
        in.nextLine();
        System.out.println("Уведіть кінцеве значення діапазону швидкості: ");
        double max = in.nextDouble();
        in.nextLine();
        List<Car> res_list = autoPark.get_car_by_speed(min,max);
        if(res_list.size() == 0){
            System.out.println("Нічого не  знайдено!");
        }
        else{
            System.out.println("Автомобілі: ");
            autoPark.show_cars(res_list);
        }
    }
    private void fourth(){
        autoPark.show_cars(cars);
    }
}
