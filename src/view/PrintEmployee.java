package view;

import data.users.Employee;

import java.util.Map;

public class PrintEmployee implements PrintInterface{
    private Map<Integer, Employee> employees;
    private int id;
    public PrintEmployee(Map<Integer, Employee> employees) {
        this.employees = employees ;

    }
    @Override
    public void print(){
        for (Map.Entry entry: this.employees.entrySet()) {
            String value = entry.getValue().toString();
            String key = String.valueOf(entry.getKey());
            System.out.println(String.format(value + "\nid= " + key));
        }
    }
}
