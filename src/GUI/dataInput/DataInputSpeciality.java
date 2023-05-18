package GUI.dataInput;

import java.util.Scanner;

public class DataInputSpeciality implements DataInputImpl{
    @Override
    public String input() {
        System.out.print("Введите должность для поиска группы: ");
        Scanner sc = new Scanner(System.in);
        String speciality = sc.nextLine();
        return speciality;
    }
}
