package GUI.dataInput;

import GUI.InputInterface;

import java.util.Scanner;

public class DataInputLastname implements InputInterface {
    @Override
    public String input() {
        System.out.print("Введите Фамилию для поиска: ");
        Scanner sc = new Scanner(System.in);
        String lastname = sc.nextLine();
        return lastname;
    }
}
