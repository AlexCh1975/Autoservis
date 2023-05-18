package controller;

import service.WriteFromTxtService;
import service.deleteService.EmployeeDeleteService;
import service.inputService.InputServiceEmployeeByLastname;
import service.inputService.InputServiceEmployeeImpl;
import service.inputService.InputServiceEmployeesGroupBySpeciality;


public class SelectionOperationEmployee {

    public static void input(Integer input) {
        switch (input) {
            case (1): // добавление сотрудника
                new InputServiceEmployeeImpl().input();
                break;
            case (2): // Поиск по фамилии сотрудника
                new InputServiceEmployeeByLastname().input();
                break;
            case (3): // Собрать группу по специальности
                new InputServiceEmployeesGroupBySpeciality().input();
                break;
            case (4): // Вывод всех сотрудников в файл
                new WriteFromTxtService().writeFromTxtService();
                break;
            case (5): // Удоление сотрудника
                new EmployeeDeleteService().remove();
                break;
        }
    }
}
