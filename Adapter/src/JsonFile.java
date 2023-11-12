public class JsonFile {
    private String text;

    public JsonFile() {
    }

    public JsonFile(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "JsonFile{" +
                "text='" + text + '\'' +
                '}';
    }
}
