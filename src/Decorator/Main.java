package Decorator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileDataSource fileDataSource = new FileDataSource("third.txt");
//        fileDataSource.writeData("Hello World!");
//        System.out.println(fileDataSource.readData());
        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(fileDataSource);
        encryptionDecorator.writeData("Hello World!");
        System.out.println(encryptionDecorator.readData());

        CompressionDecorator compressionDecorator = new CompressionDecorator(encryptionDecorator);
        compressionDecorator.writeData("Hello World!");
        System.out.println(compressionDecorator.readData());






    }
}
