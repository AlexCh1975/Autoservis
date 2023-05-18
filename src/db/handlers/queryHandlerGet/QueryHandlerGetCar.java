package db.handlers.queryHandlerGet;

import data.cars.PassengerCar;
import db.DbConnector;
import db.handlers.QueryHandlerGetInterface;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class QueryHandlerGetCar
        implements QueryHandlerGetInterface<Map<Integer, PassengerCar>> {
    private static final String QUERY= "SELECT brand, model, yer_issue, mileage, " +
            "vin, color, state_number, bodyType" +
            "FROM passenger_car " +
            "WHERE state_number = ?";
    private static final String QUERY1= "SELECT * FROM passenger_cars " +
            "WHERE state_number = ?";
    private String state_number;

    public QueryHandlerGetCar(String state_number) {
        this.state_number = state_number;
    }

    @Override
    public Map<Integer, PassengerCar> queryHandlerGet() {
        Map<Integer, PassengerCar> cars = new HashMap<>();
        try{
            DbConnector con = new DbConnector();

            PreparedStatement prSt = con.getDBConnection().prepareStatement(QUERY1);
            prSt.setString(1, this.state_number);
            ResultSet results = prSt.executeQuery();
            System.out.println("Успешное соединение!");
            while (results.next()){
                results.getInt("id");
                PassengerCar car = new PassengerCar(
                        results.getString("brand"),
                        results.getString("model"),
                        results.getInt("year_issue"),
                        results.getInt("mileage"),
                        results.getString("vin"),
                        results.getString("color"),
                        results.getString("state_number"),
                        results.getString("bodyType"));
                int client_id = results.getInt("client_id");
                cars.put(client_id, car);
                //System.out.println(car.toString() +"\n" + "client_id= " + client_id);

            }
        }
        catch(Exception e){
            e.getStackTrace();
            System.out.println("Нет соединения с базой данных!");
        }
        return null;
    }

}
