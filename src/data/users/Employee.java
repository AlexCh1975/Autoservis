package data.users;

public class Employee extends User {
    private String address;
    private String speciality;

    public Employee(String lastname, String name, String surname, String birthday, long phone,
                    String gender, String address, String speciality) {
        super(lastname, name, surname, birthday, phone, gender);
        this.address = address;
        this.speciality = speciality;
    }


    public String getAddress() {
        return address;
    }

    public String getSpeciality() {
        return speciality;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        String user = super.toString();
        return  "\nСотрудник:\n"+
                user +
                "Адрес= " + this.address + "\n" +
                "Должность= " + this.speciality + '\n' +
                "_______________________";
    }
}
