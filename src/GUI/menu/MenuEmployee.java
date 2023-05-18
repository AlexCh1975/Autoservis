package GUI.menu;

import java.util.Scanner;

public class MenuEmployee implements MenuImpl{
    @Override
    public int input() {
        System.out.print("Выбирите операцию:\n" +
                "Добавить сотрудника (1) \n" +
                "Поиск сотрудника по фамилии (2) \n" +
                "Получить список группы сотрудников (3) \n" +
                "Получить список всех сотрудников в файл (4) \n" +
                "Удолить сотрудника по фамилии (5) \n" +
                "Выход (6) \n" +
                "> ");
        Scanner sc = new Scanner(System.in);
        String str = "Не корректный ввод! Выберите 1 или 2 или 3 или 4или 5 или 6!";
        if(!sc.hasNextInt()) {
            System.out.println(str);
            return input();
        }else{
            int choice = sc.nextInt();
            if(choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 ||
                    choice == 6)
                return choice;
            else{
                System.out.println(str);
                return input();
            }
        }
    }
}
