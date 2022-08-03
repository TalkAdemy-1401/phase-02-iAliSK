package data;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import users.Employee;

import java.io.File;
import java.io.IOException;

public class XmlManager extends FileManager {

    public XmlManager(String filename) {
        super(filename);
    }

    public void writeEmployeeList(Employee[] employeeList) throws IOException {
        XmlMapper mapper = new XmlMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        mapper.writeValue(
                new File(getFilename()),
                employeeList
        );
    }
}
