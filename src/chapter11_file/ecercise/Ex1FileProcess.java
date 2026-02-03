package chapter11_file.ecercise;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Xử lý file
 * a. Viết chương trình đọc vào tất cả các dòng của 1 file. Sau đó hiển thị tất cả thông tin đọc được trên cùng 1 dòng.
 * b. Viết chương trình đọc vào đúng 3 dòng của 1 file. Sau đó hiển thị các dòng đọc được ra màn hình console.
 * c. Viết chương trình đếm số lần xuất hiện của 1 từ nào đó trong 1 file. Mỗi từ được đặt ở trên 1 dòng của file.
 * d. Viết chương trình kiểm tra xem 1 đường dẫn đang chỉ đến 1 file hay 1 thư mục.
 * e. Viết chương trình xóa 1 file hoặc 1 thư mục cho trước.
 * f. Viết chương trình đổi tên 1 file hoặc 1 thư mục cho trước.
 */
public class Ex1FileProcess {
    static void main() {
        String path = "src/chapter11_file/on_class/data.txt";
        printFile(readFile(path));

        try {
            readThreeLines(path);
            System.out.println();

            String str = "Luong";

            int count = countWord(path, "Java");
            System.out.println(str + ": " + count);
            System.out.println();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        checkPathType(path);
        System.out.println();

        renamePath(path, "data_new.txt");



    }

    // a. Viết chương trình đọc vào tất cả các dòng của 1 file. Sau đó hiển thị tất cả thông tin đọc được trên cùng 1 dòng.
    static List<String> readFile(String path) {
        List<String> lines = new ArrayList<String>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            File file = new File(path);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("IOException");
                }
            }

            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println("IOException");
                }
            }
        }
        return lines;
    }

    static void printFile(List<String> lines) {
        for (String line : lines) {
            System.out.print(line);
        }
    }

    // * b. Viết chương trình đọc vào đúng 3 dòng của 1 file. Sau đó hiển thị các dòng đọc được ra màn hình console.
    static void readThreeLines(String path) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            for (int i = 0; i < 3; i++) {
                line = reader.readLine();
                if (line != null) System.out.println(line);
            }
        }
    }

    // * c. Viết chương trình đếm số lần xuất hiện của 1 từ nào đó trong 1 file. Mỗi từ được đặt ở trên 1 dòng của file.
    static int countWord(String path, String targetWord) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(path));
        int count = 0;
        for (String line : lines) {
            if (line.trim().equals(targetWord)) count++;
        }
        return count;
    }

    // * d. Viết chương trình kiểm tra xem 1 đường dẫn đang chỉ đến 1 file hay 1 thư mục.
    static void checkPathType(String path) {
        File file = new File(path);
        if (file.isFile()) System.out.println("This is a file");
        else if (file.isDirectory()) System.out.println("This is a packet");
        else System.out.println("The path doé not exist");
    }

    // * e. Viết chương trình xóa 1 file hoặc 1 thư mục cho trước.
    static void deleteByPath(String path) {
        File file = new File(path);
        if (file.delete()) System.out.println("Deleted");
        else System.out.println("Delete failed");
    }

    // * f. Viết chương trình đổi tên 1 file hoặc 1 thư mục cho trước.
    static void renamePath(String oldPath, String newName) {
        File oldFile = new File(oldPath);
        File newFile = new File(oldFile.getParent(), newName);
        if (oldFile.renameTo(newFile)) System.out.println("Rename successfully");
        else System.out.println("Rename changed failed");
    }
}
