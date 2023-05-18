package db.handlers.queryHandlerAdd;

import data.users.Employee;
import db.DbConnector;
import db.handlers.QueryHandlerAddInterface;

import java.sql.PreparedStatement;

public class QueryHandlerAddEmployee implements QueryHandlerAddInterface<Employee> {
    private static final String QUERY = "INSERT INTO employees" +
            "(lastname, name, surname, birthday, phone, gender, address, speciality)" +
            "VALUES" +
            "(?,?,?,?,?,?,?,?)";
    @Override
    public void queryHandlerAdd(Employee employee) {
        try {
            DbConnector con = new DbConnector();
            PreparedStatement prSt = con.getDBConnection().prepareStatement(QUERY);
            prSt.setString(1, employee.getLastname());
            prSt.setString(2, employee.getName());
            prSt.setString(3, employee.getSurname());
            prSt.setString(4, employee.getBirthday());
            prSt.setLong(5, employee.getPhone());
            prSt.setString(6, employee.getGender());
            prSt.setString(7, employee.getAddress());
            prSt.setString(8, employee.getSpeciality());
            System.out.println("Успешно добавлен!");
            prSt.executeUpdate();

        }catch(Exception e){
            e.getMessage();
        }
    }

}
