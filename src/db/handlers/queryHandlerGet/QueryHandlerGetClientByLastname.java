package db.handlers.queryHandlerGet;

import data.users.Client;
import db.DbConnector;
import db.handlers.QueryHandlerGetInterface;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class QueryHandlerGetClientByLastname implements QueryHandlerGetInterface<Map<Integer,
        Client>> {
    private static final String QUERY = "SELECT * FROM clients WHERE lastname = ?";
    private String lastname;

    public QueryHandlerGetClientByLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public Map<Integer, Client> queryHandlerGet() {
        Map<Integer, Client> clients = new HashMap<>();
        try{
            DbConnector con = new DbConnector();
            PreparedStatement prSt = con.getDBConnection().prepareStatement(QUERY);
            prSt.setString(1, this.lastname);
            ResultSet results = prSt.executeQuery();
            System.out.println("Успешное соединение!");
            while (results.next()){
                Integer id = results.getInt("id");
                Client client = new Client(
                        results.getString("lastname"),
                        results.getString("name"),
                        results.getString("surname"),
                        results.getString("birthday"),
                        results.getLong("phone"),
                        results.getString("gender"),
                        results.getInt("discount"));

                clients.put(id, client);

            }
        }
        catch(Exception e){
            e.getStackTrace();
            System.out.println("Нет соединения с базой данных!");
        }
        if (clients.isEmpty()) return null;
        return clients;

    }
}


