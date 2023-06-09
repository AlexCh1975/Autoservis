package util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFromTxt {
    public static void write(List<String> users){
        String path = "src/employees.txt";
        try(FileWriter wr = new FileWriter(path)){
            for(int i = 0; i < users.size(); i++){
                wr.write(String.format("%s \n", users.get(i)));
                wr.write(String.format("___________________________________" +
                        "_______________________________________\n"));
            }
            wr.flush();
        }catch(IOException e){
            e.getMessage();
        }
    }
}
