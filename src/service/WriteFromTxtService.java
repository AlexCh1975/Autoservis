package service;

import comparator.EmployeeMapComparator;
import controller.Run;
import data.users.Employee;
import db.handlers.queryHandlerGet.QueryHandlerGetEmployees;
import util.WriteFromTxt;

import java.util.*;

public class WriteFromTxtService {
    public void writeFromTxtService(){
        if (new QueryHandlerGetEmployees() != null){
            Map<Integer, Employee> map = new QueryHandlerGetEmployees().queryHandlerGet();
            List<Map.Entry<Integer, Employee>> entries = new ArrayList<>(map.entrySet());
            entries.sort(new EmployeeMapComparator());
            List<String> employeesStr = new ArrayList<>();
            Iterator<Map.Entry<Integer, Employee>> iterator = entries.iterator();
            while (iterator.hasNext()){
                Map.Entry<Integer, Employee> next = iterator.next();
                String res = String.format("id= "+ next.getKey() + "\n"+ next.getValue() );
                employeesStr.add(res);
            }
            System.out.println("Успешно добавлено в файл!");

            WriteFromTxt.write(employeesStr);
        }else {
            System.out.println("Сотрудников не найдено!");
            Run.run();
        }
    }
}
