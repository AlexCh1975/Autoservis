package service.inputService;

import GUI.dataInput.DataInputLastname;
import controller.Run;
import data.users.Client;
import db.handlers.queryHandlerGet.QueryHandlerGetClientByLastname;
import service.validation.ValidationInputUserByLastname;
import view.PrintClient;

import java.util.Map;

public class InputServiceClientByLastname implements InputServiceInterface{
    @Override
    public void input() {
        String lastname = new DataInputLastname().input();
        if (new ValidationInputUserByLastname(lastname).isValid()) {
            QueryHandlerGetClientByLastname map = new QueryHandlerGetClientByLastname(lastname);

            Map<Integer, Client> clients =
                    new QueryHandlerGetClientByLastname(lastname).queryHandlerGet();
            new PrintClient(clients).print();
        } else
            Run.run();
    }
}
