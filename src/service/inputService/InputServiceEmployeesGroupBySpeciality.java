package service.inputService;

import GUI.dataInput.DataInputSpeciality;
import controller.Run;
import service.serviceGroup.ServiceEmployeeGroupImpl;
import service.validation.ValidationInputUserByLastname;
import view.PrintEmployeesGroup;

public class InputServiceEmployeesGroupBySpeciality implements InputServiceInterface{
    @Override
    public void input() {
        String speciality = new DataInputSpeciality().input();
        if (new ValidationInputUserByLastname(speciality).isValid()) {
            if (new ServiceEmployeeGroupImpl().createGroup(speciality) != null) {
               new PrintEmployeesGroup
                       (new ServiceEmployeeGroupImpl().createGroup(speciality)).print();
            } else
                System.out.println("С такой фамилией сотрудника нет!");
        } else
            Run.run();
    }
}
