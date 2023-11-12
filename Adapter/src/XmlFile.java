import java.util.List;

public class XmlFile {
    private String xmlName;
    private List<String > properties;

    public XmlFile() {
    }

    public XmlFile(String xmlName, List<String> properties) {
        this.xmlName = xmlName;
        this.properties = properties;
    }

    public String getXmlName() {
        return xmlName;
    }

    public void setXmlName(String xmlName) {
        this.xmlName = xmlName;
    }

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "XmlFile{" +
                "xmlName='" + xmlName + '\'' +
                ", properties=" + properties +
                '}';
    }
}
