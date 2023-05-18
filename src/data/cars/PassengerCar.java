package data.cars;

public class PassengerCar extends Car {
    private String bodyType;

    public PassengerCar(String brand, String model, int year_issue, int mileage,
                        String vin, String color, String state_number, String bodyType) {
        super(brand, model, year_issue, mileage, vin, color, state_number);
        this.bodyType = bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    @Override
    public String toString() {
        String car = super.toString();
        return "\nАвтомобиль: \n" +
                car +
                "Тип кузова= " + bodyType + '\n' +
                "__________________________";
    }
}
