package view;

import data.users.Client;

import java.util.Map;

public class PrintClient implements PrintInterface{
    private Map<Integer, Client> clients;
    private int id;
    public PrintClient(Map<Integer, Client> clients) {
        this.clients = clients;

    }
    @Override
    public void print(){
        for (Map.Entry entry: this.clients.entrySet()) {
            String value = entry.getValue().toString();
            String key = String.valueOf(entry.getKey());
            System.out.println(String.format(value + "\nid= " + key));
        }
    }

}
