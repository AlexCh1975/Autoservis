package GUI.dataInput;

import GUI.InputInterface;


import java.util.Scanner;

public class DataInputStateNumber implements InputInterface {
    @Override
    public String input() {
        System.out.print("Введите гос. номер для поиска: ");
        Scanner sc = new Scanner(System.in);
        String stateNumber = sc.nextLine();
        return stateNumber;
    }
}
