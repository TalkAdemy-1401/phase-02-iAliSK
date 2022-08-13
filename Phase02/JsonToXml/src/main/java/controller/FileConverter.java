package controller;

import model.Employee;

import java.io.IOException;

public class FileConverter {

    public static void Json2Xml(String jsonPath, String xmlPath) {
        JsonReader jsonReader = new JsonReader(jsonPath);
        XmlWriter xmlManager = new XmlWriter(xmlPath);
        Employee[] employeeList;

        try {
            employeeList = jsonReader.readEmployeeList();
            xmlManager.writeEmployeeList(employeeList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
