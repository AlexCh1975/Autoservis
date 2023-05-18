package controller;

import GUI.menu.Menu;
import GUI.menu.MenuClient;
import GUI.menu.MenuEmployee;

public class Run {
    public static void run() {
        Menu num = new Menu();
        String inputStr = String.valueOf(num.input());
        Integer input = Integer.parseInt(inputStr);
        switch (input) {
            case (1):
                inputStr = String.valueOf(new MenuEmployee().input());
                input = Integer.parseInt(inputStr);
                SelectionOperationEmployee.input(input);

                break;
            case (2):
                inputStr = String.valueOf(new MenuClient().input());
                input = Integer.parseInt(inputStr);
                SelectionOperationClient.input(input);

                break;
        }
    }
}
