package service.inputService;

import GUI.dataInput.DataInputEmployee;
import controller.Run;
import data.users.Employee;
import db.handlers.queryHandlerAdd.QueryHandlerAddEmployee;
import service.parser.ParseEmployee;
import service.validation.ValidationInputEmployee;

public class InputServiceEmployeeImpl implements InputServiceInterface{
    @Override
    public void input() {
        DataInputEmployee employeeInput = new DataInputEmployee();
        String str = employeeInput.input();
        ValidationInputEmployee validEmployee = new ValidationInputEmployee(str);
        if (validEmployee.isValid()) {
            ParseEmployee parseEmployee = new ParseEmployee(str);
            Employee user = parseEmployee.parser();
            QueryHandlerAddEmployee employeeHandler = new QueryHandlerAddEmployee();
            employeeHandler.queryHandlerAdd(user);
        } else
            Run.run();
    }
}
