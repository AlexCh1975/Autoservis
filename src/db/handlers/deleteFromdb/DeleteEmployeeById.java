package db.handlers.deleteFromdb;

import db.DbConnector;

import java.sql.PreparedStatement;

public class DeleteEmployeeById implements DeleteInterface{
    private String QUERY = "DELETE FROM employees WHERE id = ?";
    private Integer id;

    public DeleteEmployeeById(Integer id) {
        this.id = id;
    }

    @Override
    public void remove() {
        try {
            DbConnector con = new DbConnector();
            PreparedStatement prSt = con.getDBConnection().prepareStatement(QUERY);

            prSt.setInt(1, this.id);
            System.out.println("Успешно удолен!");
            prSt.executeUpdate();

        }catch(Exception e){
            e.getMessage();
        }
    }
}
