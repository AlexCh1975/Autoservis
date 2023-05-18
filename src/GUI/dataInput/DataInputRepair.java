package GUI.dataInput;

import GUI.InputInterface;

import java.util.Scanner;

public class DataInputRepair implements InputInterface {
    @Override
    public String input() {
        System.out.print("Введите данные записи (одной строкой с пробелами):\n" +
                "Описание ремонта ('текст') \n" +
                "дата (yyyy-mm-dd) \n" +
                "стоимость (руб.) \n" +
                "гос. номер (а700аа) \n" +
                "> ");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        return user;
    }
}
