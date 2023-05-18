package controller;

import service.inputService.InputServiceClientByLastname;
import service.inputService.InputServiceClientImpl;

public class SelectionOperationClient {

    public static void input(Integer input) {
        switch (input) {
            case (1):
                new InputServiceClientImpl().input();
                break;
            case (2):
                System.out.print("Пока не реалтдзовано.");
                break;
            case (3):
                new InputServiceClientByLastname().input();
                break;
            case (4):
                System.out.print("Пока не реалтдзовано.");
                break;
            case (5):
                System.out.print("Пока не реалтдзовано.");
                break;
        }
    }
}
