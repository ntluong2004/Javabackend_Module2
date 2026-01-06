package chapter4_inheritance.small_test;

import java.util.Scanner;

public class PhoneManager {
    public static Scanner input = new Scanner(System.in);

    static void main() {
        int choice;

        do {
            System.out.println("-----PHONEMANAGER-----");
            System.out.println("1. Xem danh sách điện thoại");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Sắp xếp theo giá");
            System.out.println("6. Tìm kiếm");
            System.out.println("7. Tính tổng tiền");
            System.out.println("8. Giảm giá cho điện thoại cũ");
            System.out.println("9. Thoát");

            choice = Util.functionCheck(1, 9);

            switch (choice) {
                case 1:
                    function1ViewPhoneList();
                    break;
                case 2:
                    function2AddNewPhone();
                    break;
                case 3:
                    function3UpdatePhone(input);
                    break;
                case 4:
                    MobilePhone.deletePhoneById(MobilePhone.oldPhones, MobilePhone.newPhones, input);
                    break;
                case 5:
                    function5SortPhoneList();
                    break;
                case 6:
                    function6Search();
                    break;
                case 7:
                    function7TotalOfMoney();
                    break;
                case 8:
                    function8DiscountOldPhone();
            }
        } while (choice != 9);
    }

    public PhoneManager() {
    }

    public static void function1ViewPhoneList() {
        int choice;

        do {
            System.out.println("XEM DANH SÁCH ĐIỆN THOẠI");
            System.out.println("1. Xem tất cả");
            System.out.println("2. Xem điện thoại cũ");
            System.out.println("3. Xem điện thoại mới");
            System.out.println("4. Trở về menu chính");

            choice = Util.functionCheck(1, 4);

            switch (choice) {
                case 1:
                    MobilePhone.showAllPhones();
                    continue;
                case 2:
                    MobilePhone.showOldPhone();
                    continue;
                case 3:
                    MobilePhone.showNewPhone();
            }
        } while (choice != 4);
    }

    public static void function2AddNewPhone() {
        int choice;
        do {
            System.out.println("CHỌN LOẠI ĐIỆN THOẠI MUỐN THÊM");
            System.out.println("1. Thêm mới điện thoại cũ");
            System.out.println("2. Thêm mới điện thoại mới");
            System.out.println("3. Trở về menu chính");

            choice = Util.functionCheck(1, 3);

            switch (choice) {
                case 1:
                    MobilePhone.addPhone(MobilePhone.oldPhones, "DTC", input);
                    break;
                case 2:
                    MobilePhone.addPhone(MobilePhone.newPhones, "DTM", input);
                    break;
            }
        } while (choice != 3);
    }

    public static void function3UpdatePhone(Scanner input) {
        System.out.println("Đây là danh sách sản phẩm hiện tại");
        MobilePhone.showAllPhones();

        String id;
        MobilePhone foundPhone;

        while (true) {
            System.out.println("Nhập vào id sản phẩn bạn muốn sửa đổi");
            id = input.nextLine().toUpperCase();

            if (!MobilePhone.isValidId(id)) {
                System.out.println("Lỗi: id không đúng định dạng, vui lòng nhập lại");
                continue;
            }

            foundPhone = findPhoneById(id);

            if (foundPhone == null) {
                System.out.println("Id không tồn tại trên hệ thống, vui lòng nhập lại");
            } else {
                break;
            }
        }

        System.out.println("Bạn đang sửa thông tin của sản phẩm với id: " + foundPhone.getId());

        System.out.println("Nhập tên mới (bỏ trống nếu không thay đổi)");
        String newName = input.nextLine();

        if (!newName.isEmpty()) {
            foundPhone.setName(newName);
        }

        String newPriceStr;
        double finalPrice = -1;


        do {
            System.out.println("Nhập giá mới (hoặc nhấn Enter để bỏ qua):");
            newPriceStr = input.nextLine();

            if (newPriceStr.isEmpty()){
                break;
            }

            String priceCheck = newPriceStr.startsWith("-") ? newPriceStr.substring(1) : newPriceStr

            if (MobilePhone.isNumber(newPriceStr)) {
                double rawPrice = Double.parseDouble(newPriceStr);

                if (rawPrice == 0){
                    System.out.println("Giá sản phẩm phải khác 0");
                }
                if (rawPrice < 0){
                    System.out.println();
                }
                newPrice = Double.parseDouble(newPriceStr);
                if (newPrice < 0) {
                    System.out.println("Giá sản phẩm không thể nhỏ hơn 0, vui lòng nhập lại số hợp lệ, hoặc bỏ trống nếu không thay đổi");
                }
            }
        }
        while (newPrice < 0);


        System.out.println("Nhập hãng mới (bỏ trống nếu không thay đổi)");
        String newBrand = input.nextLine();

        if (!newBrand.isEmpty()) {
            foundPhone.setBrand(newBrand);
        }

        System.out.println("Cập nhật thành công");
    }

    public static MobilePhone findPhoneById(String id) {
        for (MobilePhone p : MobilePhone.oldPhones) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        for (MobilePhone p : MobilePhone.newPhones) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    }

    public static void function5SortPhoneList() {
        int choice;
        do {
            System.out.println("---SẮP XẾP THEO GIÁ---");
            System.out.println(" 1. Tăng dần");
            System.out.println(" 2. Giảm dần");
            System.out.println("3. Trở về menu chính");
            choice = Util.functionCheck(1, 3);
        } while (choice != 3);
    }

    public static void function6Search() {
        int choice;
        do {
            System.out.println("---TÌM KIẾM ---");
            System.out.println("1. Tìm kiếm tất cả điện thoại");
            System.out.println("2. Tìm kiếm điện thoại cũ");
            System.out.println("3. Tìm kiếm điện thoại mới");
            System.out.println("4. Trở về menu chính");

            choice = Util.functionCheck(1, 4);

            switch (choice) {
                case 1, 2, 3:
                    searchMenu();
            }
        } while (choice != 4);


    }

    public static void searchMenu() {
        int choice;

        do {
            System.out.println("1. Tìm kiếm theo giá (Nhập khoảng từ bao nhiêu đến bao nhiêu)");
            System.out.println("2. Tìm kiếm theo tên");
            System.out.println("3. Tìm kiếm theo hãng");
            System.out.println("4. Trở về menu Tìm kiếm");

            choice = Util.functionCheck(1, 4);
        } while (choice != 4);
    }

    public static void function7TotalOfMoney() {
    }

    public static void function8DiscountOldPhone() {
    }
}
