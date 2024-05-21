package BuilderPattern2;

import java.util.Scanner;

public class Client {
    public static Document newDocument() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which document do you want to choose?");
        System.out.println("1. Normal document");
        System.out.println("2. Confidential document");
        int choose = sc.nextInt();
        DocumentBuilder builder;
        if (choose == 1) {
            builder = new NormalDoc();
        } else {
            builder = new ConfidentialDoc();
        }
        System.out.println("Enter extension: ");
        builder.setExtension(sc.next());
        System.out.println("Enter encryption: ");
        builder.setEncryption(sc.next());

        return builder.buildDoc();
    }

    public static void main(String[] args) {
        System.out.println(Client.newDocument());
    }
}
