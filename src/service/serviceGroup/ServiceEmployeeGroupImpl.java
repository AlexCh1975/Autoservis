package service.serviceGroup;

import comparator.EmployeeLastnameComparator;
import data.users.Employee;
import data.users.EmployeesGroup;
import db.handlers.queryHandlerGet.QueryHandlerGetEmployeeBySpeciality;

import java.util.Collections;
import java.util.List;

public class ServiceEmployeeGroupImpl implements ServiceGroupInterface<EmployeesGroup>{
    @Override
    public EmployeesGroup createGroup(String speciality) {
        if (new QueryHandlerGetEmployeeBySpeciality(speciality) != null){
            List<Employee> employees =
                    new QueryHandlerGetEmployeeBySpeciality(speciality).queryHandlerGet();
            Collections.sort(employees, new EmployeeLastnameComparator());
            return new EmployeesGroup(employees, speciality).createEmployeesGroup(speciality);
        }else
            return null;
    }
}
