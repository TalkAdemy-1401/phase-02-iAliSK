package controller;

import model.Employee;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class JsonReaderTest {

    private JsonReader jsonReader;

    @Test
    void testReadEmployeeListFileNotFound() {
        jsonReader = new JsonReader("path/to/invalid/file.json");

        Exception exception = assertThrows(FileNotFoundException.class,
                () -> jsonReader.readEmployeeList());

        String expectedMessage = "No such file";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    void testReadEmployeeList() throws IOException {
        jsonReader = new JsonReader("src/test/resources/EmployeeData.json");

        Employee[] employeeList = jsonReader.readEmployeeList();

        int exceptedValue = 4051;
        int actualValue = employeeList[0].getPrivateInfo().getId();

        assertEquals(exceptedValue, actualValue);
    }
}
