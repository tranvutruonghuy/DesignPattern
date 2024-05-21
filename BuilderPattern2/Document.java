package BuilderPattern2;

public class Document {
    private String extension;
    private String encryption;

    public Document(String extension, String encryption) {
        this.extension = extension;
        this.encryption = encryption;
    }

    @Override
    public String toString() {
        return "Entension: " + this.extension + "\n" + "Encryption: " + this.encryption;
    }

}
