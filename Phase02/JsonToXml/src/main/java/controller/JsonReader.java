package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import model.Employee;

import java.io.File;
import java.io.IOException;

public class JsonReader extends File {

    public JsonReader(String filename) {
        super(filename);
    }

    public Employee[] readEmployeeList() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();

        module.addDeserializer(Employee.class, new EmployeeDeserializer());
        mapper.registerModule(module);

        return mapper.readValue(
                getAbsoluteFile(),
                Employee[].class
        );
    }
}
