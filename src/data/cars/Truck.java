package data.cars;

public class Truck extends Car {
    private int loadCapacity;

    public Truck(String brand, String model, int year_issue, int mileage, String vin,
                 String color, String state_number, int loadCapacity) {
        super(brand, model, year_issue, mileage, vin, color, state_number);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        String track = super.toString();
        return "\nГрузовое авто: \n" +
                track +
                "loadCapacity=" + loadCapacity + '\n' +
                "______________________________";
    }
}
