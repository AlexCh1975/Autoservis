package db.handlers.queryHandlerGet;

import data.users.Employee;
import db.DbConnector;
import db.handlers.QueryHandlerGetInterface;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class QueryHandlerGetEmployeeBySpeciality
        implements QueryHandlerGetInterface<List<Employee>> {
    private static final String QUERY = "SELECT * FROM employees WHERE speciality = ?";
    private String speciality;

    public QueryHandlerGetEmployeeBySpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public List<Employee> queryHandlerGet() {
        List<Employee> employees = new ArrayList<>();

        try {

            DbConnector con = new DbConnector();

            PreparedStatement prSt = con.getDBConnection().prepareStatement(QUERY);
            prSt.setString(1, this.speciality);

            ResultSet results = prSt.executeQuery();
            System.out.println("Успешное соединение!");
            while (results.next()) {
                //Integer id = results.getInt("id");
                Employee employee = new Employee(
                        results.getString("lastname"),
                        results.getString("name"),
                        results.getString("surname"),
                        results.getString("birthday"),
                        results.getLong("phone"),
                        results.getString("gender"),
                        results.getString("address"),
                        results.getString("speciality"));

                employees.add(employee);
            }
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("Нет соединения с базой данных!");
        }
        if (employees.isEmpty()) return null;
        return employees;
    }
}
