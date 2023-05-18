package service.parser;

import data.users.Employee;

public class ParseEmployee implements ParseInterface<Employee>{
    private String strUser;

    public ParseEmployee(String strUser) {
        this.strUser = strUser;
    }
    @Override
    public Employee parser() {
        String[] employees = this.strUser.split(" ");
        try{
            long phone = Long.parseLong(employees[4]);
            Employee employee = new Employee(employees[0], employees[1], employees[2],
                    employees[3], phone, employees[5], employees[6], employees[7]);
            return employee;
        }catch(NumberFormatException e){
            System.out.println("Номер телефона некорректный!");
        }
        return null;
    }
}
