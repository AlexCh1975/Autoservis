package service.deleteService;

import GUI.dataInput.DataInputEmployeeById;
import GUI.dataInput.DataInputLastname;
import controller.Run;
import data.users.Employee;
import db.handlers.deleteFromdb.DeleteEmployeeById;
import db.handlers.queryHandlerGet.QueryHandlerGetEmployeeByLastname;
import service.validation.ValidationId;
import service.validation.ValidationInputUserByLastname;
import view.PrintEmployee;

import java.util.Map;

public class EmployeeDeleteService implements DeleteServiceInterface {

    @Override
    public void remove() {
        String lastname = new DataInputLastname().input();
        if (new ValidationInputUserByLastname(lastname).isValid()){
            Map<Integer, Employee> map =
                    new QueryHandlerGetEmployeeByLastname(lastname).queryHandlerGet();
            if (map != null){
                PrintEmployee employees = new PrintEmployee(map);
                employees.print();
                String idEmployee = new DataInputEmployeeById().input();
                if (new ValidationId(idEmployee).isValid()){
                    Integer id = Integer.parseInt(idEmployee);

                    new DeleteEmployeeById(id).remove();
                }else{
                    System.out.println("Некорректный ввод!");
                }
            }else {
                System.out.println("Сотрудников с такой фамилией не найдено!");
                Run.run();
            }
        }else{
            System.out.println("Некорректный ввод!");
            Run.run();
        }
    }
}
