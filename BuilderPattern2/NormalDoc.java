package BuilderPattern2;

public class NormalDoc implements DocumentBuilder {
    private String extension;
    private String encryption;

    @Override
    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    @Override
    public Document buildDoc() {
        return new Document(extension, encryption);
    }

}
