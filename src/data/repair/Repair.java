package data.repair;

public class Repair {
    private String repairDescription;
    private String date;
    private Double price;
    private String state_number;

    public Repair(String repairDescription, String date, Double price, String state_number) {
        this.repairDescription = repairDescription;
        this.date = date;
        this.price = price;
        this.state_number = state_number;
    }

    public String getRepairDescription() {
        return repairDescription;
    }

    public void setRepairDescription(String repairDescription) {
        this.repairDescription = repairDescription;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public String getState_number() {
        return state_number;
    }

    public void setState_number(String state_number) {
        this.state_number = state_number;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }else if (this.getClass() != obj.getClass()){
            return false;
        }else return this.getDate().equals(((Repair) obj).getDate());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
