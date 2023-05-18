package data.cars;

public abstract class Car {
    private String brand;
    private String model;
    private int year_issue;
    private long mileage;
    private String vin;
    private String color;
    private String state_number;

    public Car(String brand, String model, int year_issue, long mileage, String vin,
               String color, String state_number) {
        this.brand = brand;
        this.model = model;
        this.year_issue = year_issue;
        this.mileage = mileage;
        this.vin = vin;
        this.color = color;
        this.state_number = state_number;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear_issue() {
        return year_issue;
    }

    public long getMileage() {
        return mileage;
    }

    public String getVin() {
        return vin;
    }

    public String getColor() {
        return color;
    }

    public String getState_number() {
        return state_number;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear_issue(int year_issue) {
        this.year_issue = year_issue;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setState_number(String state_number) {
        this.state_number = state_number;
    }

    @Override
    public String toString() {
        return
                "Бренд= " + brand + '\n' +
                "Модель= " + model + '\n' +
                "Год выпуска= " + year_issue + '\n' +
                "Пробег= " + mileage + '\n' +
                "Vin= " + vin + '\n' +
                "Цвет= " + color + '\n' +
                "Гос. номер= " + state_number + '\n';
    }
}
