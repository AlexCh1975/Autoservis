package db.handlers.queryHandlerAdd;

import data.users.Client;
import db.DbConnector;
import db.handlers.QueryHandlerAddInterface;

import java.sql.PreparedStatement;

public class  QueryHandlerAddClient implements QueryHandlerAddInterface<Client> {
    private static final String QUERY = "INSERT INTO clients" +
            "(lastname, name, surname, birthday, phone, gender, discount)" +
            "VALUES" +
            "(?,?,?,?,?,?,?)";
    @Override
    public void queryHandlerAdd(Client client) {
        try {
            DbConnector con = new DbConnector();
            PreparedStatement prSt = con.getDBConnection().prepareStatement(QUERY);
            prSt.setString(1, client.getLastname());
            prSt.setString(2, client.getName());
            prSt.setString(3, client.getSurname());
            prSt.setString(4, client.getBirthday());
            prSt.setLong(5, client.getPhone());
            prSt.setString(6, client.getGender());
            prSt.setInt(7, client.getDiscount());
            System.out.println("Успешно добавлен!");
            prSt.executeUpdate();

        }catch(Exception e){
            e.getMessage();
        }
    }

}
