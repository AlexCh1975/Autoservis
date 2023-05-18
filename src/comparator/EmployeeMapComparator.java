package comparator;

import data.users.Employee;

import java.util.*;

public class EmployeeMapComparator implements Comparator<Map.Entry<Integer, Employee>>{
    @Override
    public int compare(Map.Entry<Integer, Employee> e1, Map.Entry<Integer, Employee> e2) {
            return e1.getValue().getSpeciality().compareTo(e2.getValue().getSpeciality());
    }
}
