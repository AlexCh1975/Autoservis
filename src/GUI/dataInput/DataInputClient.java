package GUI.dataInput;

import GUI.InputInterface;

import java.util.Scanner;

public class DataInputClient implements InputInterface {
    @Override
    public String input(){
        System.out.print("Введите данные записи (одной строкой с пробелами):\n" +
                "Фамилию (Иванов) \n" +
                "Имя (Иван) \n" +
                "Отчество (Ивановичь) \n" +
                "Дата рождения (yyyy-mm-dd) \n" +
                "Телефон (888888888) \n" +
                "пол (f - женщина, m - мужчина) \n" +
                "скидка в % (10) \n" +
                "> ");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        return user;
    }
}
