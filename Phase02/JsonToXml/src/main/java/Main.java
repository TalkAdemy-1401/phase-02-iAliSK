import java.io.IOException;
import java.util.List;

public class Main {

    private static final String jsonPath = "../../EmployeeData.json";
    private static final String xmlPath = "../../EmployeeData.xml";

    public static void main(String[] args) throws IOException {
        // read employee list from json file
        JsonManager jsonManager = new JsonManager();
        List<Employee> employeeList = jsonManager.readList(jsonPath);

        // write employee list to xml file
        XmlManager xmlManager = new XmlManager();
        xmlManager.writeList(employeeList, xmlPath);
    }
}
