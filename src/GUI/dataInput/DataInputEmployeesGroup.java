package GUI.dataInput;

import GUI.InputInterface;

import java.util.Scanner;

public class DataInputEmployeesGroup implements InputInterface {
    @Override
    public String input() {
        System.out.print("Введите должность для поиска группы: ");
        Scanner sc = new Scanner(System.in);
        String stateNumber = sc.nextLine();
        return stateNumber;
    }
}
