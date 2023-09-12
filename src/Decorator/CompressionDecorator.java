package Decorator;

import java.io.IOException;

public class CompressionDecorator extends DataSourceDecorator{
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) throws IOException {
        System.out.println("Compressing data...");
        super.writeData(data);
        System.out.println("Data compressed.");
    }

    @Override
    public String readData() throws IOException {
        System.out.println("Decompressing data...");
        String data = super.readData();
        System.out.println("Data decompressed.");
        return data;
    }
}
