package GUI.dataInput;

import java.util.Scanner;

public class DataInputEmployeeById implements DataInputImpl{
    @Override
    public String input() {
        System.out.print("Введите id сотрудника (для удоления):\n" +
                "> ");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        return user;
    }
}
