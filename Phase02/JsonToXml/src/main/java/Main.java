import controller.FileConverter;

public class Main {

    private static final String jsonPath = "src/main/resources/EmployeeData.json";
    private static final String xmlPath = "src/main/resources/EmployeeData.xml";

    public static void main(String[] args) {

        FileConverter.Json2Xml(jsonPath, xmlPath);
    }
}
