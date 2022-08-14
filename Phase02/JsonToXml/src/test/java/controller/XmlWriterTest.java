package controller;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

class XmlWriterTest {

    private JsonReader jsonReader;
    private XmlWriter xmlWriter;

    @BeforeEach
    void setUp() {
        jsonReader = new JsonReader("src/test/resources/EmployeeData.json");
        xmlWriter = new XmlWriter("src/test/resources/EmployeeDataTest.xml");
    }

    @Test
    void testWriteEmployeeList() throws IOException {

        xmlWriter.writeEmployeeList(
                jsonReader.readEmployeeList()
        );

        File expectedFile = new File("src/test/resources/EmployeeData.xml");
        File actualFile = xmlWriter.getAbsoluteFile();

        assertTrue(FileUtils.contentEquals(expectedFile, actualFile));
    }
}
