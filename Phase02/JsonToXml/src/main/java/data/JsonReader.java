package data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import user.Employee;
import user.EmployeeDeserializer;

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
