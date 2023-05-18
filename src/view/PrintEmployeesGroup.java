package view;

import data.users.EmployeesGroup;

public class PrintEmployeesGroup implements PrintInterface{
    private EmployeesGroup employees;
    private int id;
    public PrintEmployeesGroup(EmployeesGroup employees) {
        this.employees = employees ;

    }
    @Override
    public void print(){
        System.out.println("********************");
        System.out.println(employees.getNameGroup());
        System.out.println("********************");
        System.out.println(employees.getEmployees().toString());
        System.out.println("********************");
    }
}
