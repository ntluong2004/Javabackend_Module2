package chapter11_file.on_class;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteFile {
    private static void writeFile(String path, String data) {
        List<String> lines = new ArrayList<>();
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;

        File file = new File(path);

        try {
            fileWriter = new FileWriter(file, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        bufferedWriter = new BufferedWriter(fileWriter);

        try {
            bufferedWriter.newLine();
            bufferedWriter.write(data);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void main() {
        writeFile("src/chapter11_file/on_class/data.txt", "Omg");
    }
}
