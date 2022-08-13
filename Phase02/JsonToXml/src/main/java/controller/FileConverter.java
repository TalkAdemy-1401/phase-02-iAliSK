package controller;

import model.Employee;

import java.io.IOException;

public class FileConverter {

    private static FileConverter instance;

    private FileConverter() {
    }

    public static FileConverter getInstance() {
        if (instance == null)
            instance = new FileConverter();
        return instance;
    }

    public void Json2Xml(String jsonPath, String xmlPath) {
        JsonReader jsonReader = JsonReader.getInstance();
        XmlWriter xmlManager = XmlWriter.getInstance();
        Employee[] employeeList;

        try {
            employeeList = jsonReader.readEmployeeList(jsonPath);
            xmlManager.writeEmployeeList(employeeList, xmlPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
