package data;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import user.Employee;
import user.EmployeeSerializer;

import java.io.File;
import java.io.IOException;

public class XmlWriter extends File {

    public XmlWriter(String filename) {
        super(filename);
    }

    public void writeEmployeeList(Employee[] employeeList) throws IOException {
        XmlMapper mapper = new XmlMapper();
        SimpleModule module = new SimpleModule();

        module.addSerializer(Employee.class, new EmployeeSerializer());
        mapper.registerModule(module);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        mapper.writeValue(
                getAbsoluteFile(),
                employeeList
        );
    }
}
