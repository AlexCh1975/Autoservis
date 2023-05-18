package db.handlers.queryHandlerAdd;

import data.cars.PassengerCar;
import db.DbConnector;
import db.handlers.QueryHandlerAddInterface;

import java.sql.PreparedStatement;

public class QueryHandlerAddPassengerCar implements QueryHandlerAddInterface<PassengerCar> {
    private static final String QUERY = "INSERT INTO passenger_cars" +
            "(brand, model, year_issue, mileage, vin, color, state_number, bodyType, client_id)" +
            "VALUES" +
            "(?,?,?,?,?,?,?,?,?)";
    @Override
    public void queryHandlerAdd(PassengerCar car) {
        int client_id = 3;
        try{
            DbConnector con = new DbConnector();
            PreparedStatement prSt = con.getDBConnection().prepareStatement(QUERY);
            prSt.setString(1, car.getBrand());
            prSt.setString(2, car.getModel());
            prSt.setInt(3, car.getYear_issue());
            prSt.setLong(4, car.getMileage());
            prSt.setString(5, car.getVin());
            prSt.setString(6, car.getColor());
            prSt.setString(7, car.getState_number());
            prSt.setString(8, car.getBodyType());
            prSt.setInt(9, client_id);
            System.out.println("Авто успешно добавлено!");
            prSt.executeUpdate();
        }catch(Exception e){
            e.getMessage();
        }
    }

}
