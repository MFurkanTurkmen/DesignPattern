import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        XmlFile xmlFile= new XmlFile();
        xmlFile.setXmlName("user post");
        xmlFile.setProperties(List.of("name=furkan","surname=türkmen"));

        XmlToJsonAdapter xmlToJsonAdapter= new XmlToJsonAdapter(xmlFile);
        JsonFile jsonFile=xmlToJsonAdapter.toJson();
        System.out.println(jsonFile);

    }
}