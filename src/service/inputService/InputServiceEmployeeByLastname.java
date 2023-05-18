package service.inputService;

import GUI.dataInput.DataInputLastname;
import controller.Run;
import data.users.Employee;
import db.handlers.queryHandlerGet.QueryHandlerGetEmployeeByLastname;
import service.validation.ValidationInputUserByLastname;
import view.PrintEmployee;

import java.util.Map;

public class InputServiceEmployeeByLastname implements InputServiceInterface{
    @Override
    public void input() {
        String lastname = new DataInputLastname().input();
        if (new ValidationInputUserByLastname(lastname).isValid()) {
            Map<Integer, Employee> employees =
                    new QueryHandlerGetEmployeeByLastname(lastname).queryHandlerGet();
            if (employees != null) {
                new PrintEmployee(employees).print();
            } else
                System.out.println("С такой фамилией сотрудника нет!");
        } else
            Run.run();
    }
}
