package GUI.menu;

import GUI.InputInterface;

import java.util.Scanner;

public class Menu implements InputInterface<Integer> {
    @Override
    public Integer input(){
        System.out.print("Выбирите операцию:\n" +
                "Работа с базай сотрудников (1) \n" +
                "Работа с базай клиентов (2) \n" +
                "Выход (3) \n" +
                "> ");
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) {
            System.out.println("Не корректный ввод! Выберите 1 или 2 или 3!");
            return input();
        }else{
            int choice = sc.nextInt();
            if(choice == 1 || choice == 2 || choice == 3)
                return choice;
            else{
                System.out.println("Не корректный ввод! Выберите 1 или 2 или 3!");
                return input();
            }
        }
    }
}
