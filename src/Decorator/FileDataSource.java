package Decorator;

import java.io.*;

public class FileDataSource implements DataSource {

    private String path = "src/Decorator/";
    private String name = "file.txt";

    public FileDataSource(String name) {
        this.name = name;
    }

    @Override
    public void writeData(String data) throws IOException {
        File file = new File(path + name);
        //  FileOutputStream fos = null;
        //  try {
        //      if (!file.exists()) {
        //          file.createNewFile();
        //      }
        //      fos = new FileOutputStream(file);
        //      fos.write(data.getBytes(), 0, data.length());
        //  } catch (IOException e) {
        //      throw new RuntimeException(e);
        //  }
        FileWriter fw = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file);
            fw.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fw.close();
        }
        System.out.println("Write data to file: " + path + name);
    }

    @Override
    public String readData() throws IOException {
        File file = new File(path + name);
        FileReader fr = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            fr = new FileReader(file);
            char[] a = new char[50];
            fr.read(a);
            return new String(a);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fr.close();
        }
    }
}
