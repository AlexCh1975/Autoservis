package service.inputService;

import GUI.dataInput.DataInputClient;
import controller.Run;
import data.users.Client;
import db.handlers.queryHandlerAdd.QueryHandlerAddClient;
import service.parser.ParseClient;
import service.validation.ValidationInputClient;

public class InputServiceClientImpl implements InputServiceInterface{
    @Override
    public void input() {
        String clientStr = new DataInputClient().input();
        if (new ValidationInputClient(clientStr).isValid()) {
            Client client = new ParseClient(clientStr).parser();
            new QueryHandlerAddClient().queryHandlerAdd(client);
        } else
            Run.run();
    }
}
