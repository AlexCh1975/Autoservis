package comparator;

import data.cars.PassengerCar;
import java.util.Comparator;

public class PassengerCarAgeComparator implements Comparator<PassengerCar> {

    @Override
    public int compare(PassengerCar o1, PassengerCar o2) {
        return o1.getYear_issue() - o2.getYear_issue();
    }
}
