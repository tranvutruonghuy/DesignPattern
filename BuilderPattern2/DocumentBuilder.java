package BuilderPattern2;

public interface DocumentBuilder {
    public void setExtension(String extension);

    public void setEncryption(String encryption);

    public Document buildDoc();
}
