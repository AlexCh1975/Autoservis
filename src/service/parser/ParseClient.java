package service.parser;

import data.users.Client;

public class ParseClient implements ParseInterface<Client>{
    private String strUser;

    public ParseClient(String strUser) {
        this.strUser = strUser;
    }
    @Override
    public Client parser(){
        String[] clients = this.strUser.split(" ");
        try{
            long phone = Long.parseLong(clients[4]);
            int discount = Integer.parseInt(clients[6]);
            Client client = new Client(clients[0], clients[1], clients[2], clients[3],
                    phone, clients[5], discount);
            return client;
        }catch(NumberFormatException e){
            System.out.println("Номер телефона некорректный!");
        }
        return null;
    }
}
