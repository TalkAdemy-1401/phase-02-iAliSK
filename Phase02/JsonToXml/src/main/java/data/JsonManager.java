package data;

import com.fasterxml.jackson.databind.ObjectMapper;
import users.Employee;

import java.io.File;
import java.io.IOException;

public class JsonManager extends FileManager {

    public JsonManager(String filename) {
        super(filename);
    }

    public Employee[] readEmployeeList() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(
                new File(getFilename()),
                Employee[].class
        );
    }
}
