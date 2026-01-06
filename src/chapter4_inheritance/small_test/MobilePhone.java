package chapter4_inheritance.small_test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    String id;
    private String name;
    private double price;
    private LocalDate warranty;

    public String getId() {
        return id;
    }

    private String brand;

    static ArrayList<MobilePhone> oldPhones = new ArrayList<>();
    static ArrayList<MobilePhone> newPhones = new ArrayList<>();

    //    Thêm dữ liệu tạm cho chương trình
    static {
        // Điện thoại cũ: ID bắt đầu bằng DTC + 3 số
        oldPhones.add(new MobilePhone("DTC001", "iPhone 11", 7000000, LocalDate.of(2023, 1, 1), "Apple"));
        oldPhones.add(new MobilePhone("DTC002", "Samsung S20", 5000000, LocalDate.of(2022, 5, 20), "Samsung"));

        // Điện thoại mới: ID bắt đầu bằng DTM + 3 số
        newPhones.add(new MobilePhone("DTM001", "iPhone 15", 25000000, LocalDate.of(2025, 12, 31), "Apple"));
        newPhones.add(new MobilePhone("DTM002", "Oppo Reno 11", 12000000, LocalDate.of(2025, 6, 15), "Oppo"));
    }

    public MobilePhone() {
    }

    public MobilePhone(String id, String name, double price, LocalDate warranty, String brand) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.warranty = warranty;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public LocalDate getWarranty() {
        return warranty;
    }

    public void setWarranty(LocalDate warranty) {
        this.warranty = warranty;
    }

    public static void showAllPhones() {
        System.out.println("DANH SÁCH TẤT CẢ ĐIỆN THOẠI");
        showNewPhone();
        showOldPhone();
    }

    public static void showOldPhone() {
        System.out.println("ĐIỆN THOẠI CŨ");
        for (MobilePhone p : oldPhones) {
            System.out.printf("Id: %s | Tên: %s | Hãng: %s | Giá: %.2f | Ngày bảo hành: %s \n", p.id, p.name, p.brand, p.price, p.warranty);
        }
    }

    public static void showNewPhone() {
        System.out.println("ĐIỆN THOẠI MỚI");
        for (MobilePhone p : newPhones) {
            System.out.printf("Id: %s | Tên: %s | Hãng: %s | Giá: %.2f | Ngày bảo hành: %s \n", p.id, p.name, p.brand, p.price, p.warranty);

        }
    }

    public static boolean isValidId(String id) {

        if (id.length() != 6) {
            return false;
        }

        boolean startWithDTM = id.startsWith("DTM");
        boolean startWithDTC = id.startsWith("DTC");

        if (!startWithDTM && !startWithDTC) {
            return false;
        }

        for (int i = 3; i < 6; i++) {
            if (!Character.isDigit(id.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void addPhone(ArrayList<MobilePhone> list, String preId, Scanner input) {

        String id = nextId(list, preId);
        System.out.println("id tự thêm " + id);

        System.out.println("Nhập tên sản phẩm");
        String name = input.nextLine();

        System.out.println("Nhập giá sản phẩm");
        double price = inputPrice(input);

        System.out.println("Ngày bảo hành tạm thời sẽ là một năm kể từ ngày hôm nay");

        System.out.println("Nhập hãng sản phẩm");
        String brand = input.nextLine();

        LocalDate warranty = LocalDate.now().plusYears(1);

        MobilePhone newPhone = new MobilePhone(id, name, price, warranty, brand);
        list.add(newPhone);

        System.out.println("Thêm mới thành công");
    }

    public static boolean isNumber(String input) {
//  Xử lý nếu giá nhập vào là rỗng
        if (input == null || input.isEmpty()) {
            return false;
        }

        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static double inputPrice(Scanner input) {
        String inputPrice;
        double price;

        while (true) {
            System.out.println("Nhập giá tiền sản phẩm ");
            inputPrice = input.nextLine();

            if (isNumber(inputPrice)) {
                price = Double.parseDouble(inputPrice);
                break;
            } else {
                System.out.println("Lỗi: giá tiền phải là số, vui lòng nhập lại");
            }
        }
        return price;
    }

    public static String nextId(ArrayList<MobilePhone> list, String preId) {
        int maxNumber = 0;
        for (MobilePhone p : list) {
            String numberPart = p.getId().substring(3);
            int number = Integer.parseInt(numberPart);
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        return String.format("%s%03d", preId, maxNumber + 1);
    }

    public static void deletePhoneById(ArrayList<MobilePhone> oldPhones, ArrayList<MobilePhone> newPhones, Scanner input) {
        String id;


        System.out.println("Vui lòng nhập ID điện thoại cần xoá (DTMxxx hặc DTCxxx, không cần viết hoa)");
        id = input.nextLine().toUpperCase();

        if (isValidId(id)) {
            System.out.println("Id không đúng định dạng, vui lòng nhập lại");
            return;
        }

        ArrayList<MobilePhone> targetList = id.startsWith("DTC") ? oldPhones : newPhones;

        MobilePhone foundPhone;
        for (MobilePhone p : targetList) {
            if (p.getId().equalsIgnoreCase(id)) {
                foundPhone = p;
                System.out.println("Tìm thấy: " + foundPhone.getName() + " (ID: " + foundPhone.getId() + ")");
                System.out.println("Xác nhận xoá (y/n): ");
                String confirm = input.nextLine();

                if (confirm.equalsIgnoreCase("y")) {
                    targetList.remove(p);
                    System.out.println("Đã xoá thành công");
                } else {
                    System.out.println("Huỷ bỏ thao tác");
                }
            } else {
                System.out.println("=> Lỗi: Không tìm thấy ID " + id + " trong danh sách tương ứng.");
            }
        }
    }
}
