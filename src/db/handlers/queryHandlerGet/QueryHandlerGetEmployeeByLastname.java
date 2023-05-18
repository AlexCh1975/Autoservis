package db.handlers.queryHandlerGet;

import data.users.Employee;
import db.DbConnector;
import db.handlers.QueryHandlerGetInterface;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class QueryHandlerGetEmployeeByLastname
        implements QueryHandlerGetInterface<Map<Integer, Employee>> {
    private static final String QUERY = "SELECT * FROM employees WHERE lastname = ?";
    private String lastname;

    public QueryHandlerGetEmployeeByLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public Map<Integer, Employee> queryHandlerGet() {
        Map<Integer, Employee> employees = new HashMap<>();

        try{

            DbConnector con = new DbConnector();

            PreparedStatement prSt = con.getDBConnection().prepareStatement(QUERY);
            prSt.setString(1, this.lastname);
            System.out.println("Успешное соединение!");
            ResultSet results = prSt.executeQuery();
            //System.out.println("Успешное соединение!");
            while (results.next()){
                Integer id = results.getInt("id");
                Employee employee = new Employee(
                        results.getString("lastname"),
                        results.getString("name"),
                        results.getString("surname"),
                        results.getString("birthday"),
                        results.getLong("phone"),
                        results.getString("gender"),
                        results.getString("address"),
                        results.getString("speciality"));

                employees.put(id, employee);

            }
        }
        catch(Exception e){
            e.getStackTrace();
            System.out.println("Нет соединения с базой данных!");
        }
        if (employees.isEmpty()) return null;
        return employees;
    }
}
