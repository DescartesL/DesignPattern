package Decorator;

import java.io.IOException;

public class EncryptionDecorator extends DataSourceDecorator{
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) throws IOException {
        System.out.println("Encrypting data...");
        super.writeData(data);
        System.out.println("Data encrypted.");
    }

    @Override
    public String readData() throws IOException {
        System.out.println("Decrypting data...");
        String data = super.readData();
        System.out.println("Data decrypted.");
        return data;
    }
}
