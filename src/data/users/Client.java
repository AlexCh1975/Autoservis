package data.users;

public class Client extends User implements Comparable<Client>{
    private int discount;

    public Client(String lastname, String name, String surname, String birthday, long phone,
                  String gender, int discount) {
        super(lastname, name, surname, birthday, phone, gender);
        this.discount = discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        String user = super.toString();
        return  "\nКлиент:\n"+
                user +
                "Скидка= " + this.discount ;
    }

    /*@Override
    public int compareTo(Client o) {
        return this.getLastname().compareTo(o.getLastname());
    }*/
    @Override
    public int compareTo(Client o) {
        return this.getDiscount() - o.getDiscount();
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }else if (this.getClass() != obj.getClass()){
            return false;
        }else return this.getBirthday().equals(((Client) obj).getBirthday());
    }
}
