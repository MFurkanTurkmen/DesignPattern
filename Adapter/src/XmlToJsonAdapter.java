public class XmlToJsonAdapter {
    private XmlFile xmlFile;

    public XmlToJsonAdapter(XmlFile xmlFile) {
        this.xmlFile = xmlFile;
    }

    public JsonFile toJson(){
        JsonFile jsonFile= new JsonFile();
        jsonFile.setText("{");
        for (String property: xmlFile.getProperties()){
            jsonFile.setText(jsonFile.getText()+property);
        }
        jsonFile.setText(jsonFile.getText()+"}");
        return jsonFile;
    }
}
