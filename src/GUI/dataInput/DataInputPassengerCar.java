package GUI.dataInput;

import GUI.InputInterface;

import java.util.Scanner;

public class DataInputPassengerCar implements InputInterface {
    @Override
    public String input() {
        System.out.print("Введите данные записи (одной строкой с пробелами):\n" +
                "бренд (toyota) \n" +
                "модель (rav4) \n" +
                "год выпуска (2000) \n" +
                "пробег (км) \n" +
                "vin (17 знаков) \n" +
                "Цвет  \n" +
                "гос. номер (а777аа) \n" +
                "тип транспартного (кол. дверей или седан или джип и т.д.)\n" +
                "id владельца\n" +
                "> ");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        return user;
    }
}
