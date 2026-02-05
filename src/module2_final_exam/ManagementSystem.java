package module2_final_exam;

import java.io.*;
import java.util.*;
import module2_final_exam.Validator;

public class ManagementSystem {
    public static void main(String[] args) {
        // Dùng Map để loại bỏ trùng ID ngay từ đầu (Yêu cầu III.2)
        Map<String, Candidate> candidateMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("src/module2_final_exam/input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    String[] data = line.split(",");
                    String id = data[0];
                    String name = data[1];
                    int birthDay = Integer.parseInt(data[2]);
                    String phone = data[3];
                    String email = data[4];
                    int type = Integer.parseInt(data[5]);

                    Validator.checkData(birthDay, email);

                    Candidate c = null;
                    if (type == 0) c = new Experience(id, name, birthDay, phone, email, Integer.parseInt(data[6]), data[7]);
                    else if (type == 1) c = new Fresher(id, name, birthDay, phone, email, data[6], data[7], data[8]);
                    else if (type == 2) c = new Intern(id, name, birthDay, phone, email, data[6], data[7], data[8]);

                    if (c != null) candidateMap.putIfAbsent(id, c);

                } catch (BirthDayException | EmailException e) {
                    System.err.println("Dữ liệu lỗi: " + e.getMessage());
                } catch (Exception e) {
                    System.err.println("The system has encountered an unexpected problem, sincerely sorry !!!");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Số lượng ứng viên hợp lệ: " + Candidate.candidateCount);

        // 1. Tổng hợp tên bằng StringBuffer
        StringBuffer allNames = new StringBuffer();
        List<Candidate> list = new ArrayList<>(candidateMap.values());
        for (int i = 0; i < list.size(); i++) {
            allNames.append(list.get(i).getFullName());
            if (i < list.size() - 1) allNames.append(", ");
        }
        System.out.println("Danh sách tên: " + allNames);

        // 2. Sắp xếp (Yêu cầu III.3)
        Collections.sort(list, (c1, c2) -> {
            if (c1.getCandidateType() != c2.getCandidateType()) {
                return Integer.compare(c1.getCandidateType(), c2.getCandidateType());
            }
            return Integer.compare(c2.getBirthDay(), c1.getBirthDay()); // Năm sinh lớn đứng trước
        });

        // 3. Hiển thị thông tin
        System.out.println("\n--- DANH SÁCH SAU KHI SẮP XẾP ---");
        for (Candidate c : list) {
            c.showMe();
        }
    }
}
