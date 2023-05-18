package data.users;

import java.util.List;

public class EmployeesGroup {
    private List<Employee> employees;
    private String nameGroup;

    public EmployeesGroup(List<Employee> employees, String nameGroup) {
        this.employees = employees;
        this.nameGroup = nameGroup;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public  EmployeesGroup createEmployeesGroup(String speciality){
        this.nameGroup = speciality;
        return new EmployeesGroup(this.employees, this.nameGroup);
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    @Override
    public String toString() {
        String employee = super.toString();
        return "\nnameGroup:\n" +
                "________________________\n" +
                employee +
                "________________________";
    }


}
