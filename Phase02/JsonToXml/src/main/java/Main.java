import data.JsonManager;
import data.XmlManager;
import users.Employee;

import java.io.IOException;

public class Main {

    private static final String jsonPath = "../../EmployeeData.json";
    private static final String xmlPath = "../../EmployeeData.xml";

    public static void main(String[] args) throws IOException {
        // read employee list from json file
        JsonManager jsonManager = new JsonManager(jsonPath);
        Employee[] employeeList = jsonManager.readEmployeeList();

        // write employee list to xml file
        XmlManager xmlManager = new XmlManager(xmlPath);
        xmlManager.writeEmployeeList(employeeList);
    }
}
