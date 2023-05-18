package comparator;

import data.users.Employee;
import java.util.Comparator;

public class EmployeeLastnameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getLastname().compareTo(o2.getLastname());
    }
}
