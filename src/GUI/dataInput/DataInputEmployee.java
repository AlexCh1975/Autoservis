package GUI.dataInput;

import GUI.InputInterface;

import java.util.Scanner;

public class DataInputEmployee implements InputInterface {
    @Override
    public String input() {
        System.out.print("Введите данные записи (одной строкой с пробелами):\n" +
                "Фамилию (Иванов) \n" +
                "Имя (Иван) \n" +
                "Отчество (Ивановичь) \n" +
                "Дата рождения (yyyy-mm-dd) \n" +
                "Телефон (888888888) \n" +
                "пол (f - женщина, m - мужчина) \n" +
                "адрес ('ул. Мира д.17 кв.5') \n" +
                "должность (слесарь) \n" +
                "> ");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        return user;
    }
}
