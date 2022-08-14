package controller;

import model.Employee;

import java.io.IOException;

public class FileConverter {

    public static void Json2Xml(String jsonPath, String xmlPath) throws IOException {
        JsonReader jsonReader = new JsonReader(jsonPath);
        XmlWriter xmlManager = new XmlWriter(xmlPath);
        Employee[] employeeList;

        employeeList = jsonReader.readEmployeeList();
        xmlManager.writeEmployeeList(employeeList);
    }
}
