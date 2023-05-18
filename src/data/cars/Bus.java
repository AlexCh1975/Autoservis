package data.cars;

public class Bus extends Car {
    private int passengerSeats;

    public Bus(String brand, String model, int year_issue, int mileage, String vin,
               String color, String state_number, int passengerSeats) {
        super(brand, model, year_issue, mileage, vin, color, state_number);
        this.passengerSeats = passengerSeats;
    }

    public void setPassengerSeats(int passengerSeats) {
        this.passengerSeats = passengerSeats;
    }

    public int getPassengerSeats() {
        return passengerSeats;
    }

    @Override
    public String toString() {
        String bus = super.toString();
        return "\nАвтобус: \n" +
                "passengerSeats=" + passengerSeats + '\n' +
                "____________________________";
    }
}
