package Auto;

import java.util.Comparator;

public class FuelComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getFuel_consumption() == o2.getFuel_consumption()) {
            return 0;
        }
        if (o1.getFuel_consumption() > o2.getFuel_consumption()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
