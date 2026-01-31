package chapter10_exception.exercise.exercise_v5_chapter10;

import chapter10_exception.exercise.exercise_v5_chapter10.exception.EmptyFieldException;
import chapter10_exception.exercise.exercise_v5_chapter10.exception.MinLengthException;
import chapter10_exception.exercise.exercise_v5_chapter10.exception.NegativeNumberException;
import chapter10_exception.exercise.exercise_v5_chapter10.exception.NumberOutOfRangeException;
import chapter10_exception.exercise.exercise_v5_chapter10.validation.CommonValidation;
import chapter10_exception.exercise.exercise_v5_chapter10.validation.PhoneValidation;

import java.util.*;

/**
 * a. Tạo ra một EmptyFieldException để kiểm tra tất cả các trường không được phép trống.
 * b. Sử dụng NumberFormatException có sẵn của Java để kiểm tra giá, thời gian bảo hành, tình trạng pin, số lượng phải là số.
 * c. Tạo ra một NumberOutOfRangeException khi thông tin về tình trạng pin của điện thoại cũ không thuộc phạm vi 0-100%.
 * d. Tạo ra một MinLengthException khi mô tả thêm của điện thoại cũ là rỗng hoặc quá ngắn (dưới 10 ký tự).
 * e. Tạo ra một NegativeNumberException khi giá, thời gian bảo hành, số lượng là một số âm.
 */

public class PhoneService {
    private List<NewPhone> newPhoneList = new ArrayList<>();
    private List<OldPhone> oldPhoneList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private int newCount = 1, oldCount = 1;

    public PhoneService() {
        newPhoneList.add(new NewPhone("DTM001", "iPhone 15", 25000, "12 months", "Apple", 5));

        oldPhoneList.add(new OldPhone("DTC001", "iPhone 3", 50000, "3 months", "Apple", 85, "Good condition"));
        oldPhoneList.add(new OldPhone("DTC001", "iPhone 1", 8000, "3 months", "Apple", 85, "Good condition"));
        oldPhoneList.add(new OldPhone("DTC001", "iPhone 2", 9000, "3 months", "Apple", 85, "Good condition"));


        newCount = 2;

        oldCount = 2;
    }

    public void showList(int type) {
        if (type == 1 || type == 3) {
            System.out.println("\n--- NEW PHONES ---");
            for (NewPhone p : newPhoneList) p.displayInfo();
        }
        if (type == 1 || type == 2) {
            System.out.println("\n--- OLD PHONES ---");
            for (OldPhone p : oldPhoneList) p.displayInfo();
        }
    }

    //      Enter name process
    public void addNew(int type) {

        try {
            String name;
            while (true) {
                try {
                    System.out.print("Enter Name: ");
                    name = scanner.nextLine();
                    CommonValidation.validateEmptyField(name, "Field name ");
                    break;
                } catch (EmptyFieldException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

//      Enter price process
            double price;
            while (true) {
                try {
                    System.out.print("Enter Price: ");
                    String input = scanner.nextLine();

                    CommonValidation.validateEmptyField(input, "Price field ");

                    price = Double.parseDouble(input);

                    CommonValidation.validateNegativeNumber(price, "Price ");

                    break;

                } catch (EmptyFieldException | NegativeNumberException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (NumberFormatException e) {
                    System.out.println("Error: Price must be a valid number!");
                }
            }

            String manufacturer;
            while (true) {
                try {
                    System.out.print("Manufacturer: ");
                    manufacturer = scanner.nextLine();

                    CommonValidation.validateEmptyField(manufacturer, "Manufacturer field ");

                    break;

                } catch (EmptyFieldException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }


            if (type == 2) {
                String id = String.format("DTM%03d", newCount++);
                System.out.print("Quantity: ");
                int qty = Integer.parseInt(scanner.nextLine());
                newPhoneList.add(new NewPhone(id, name, price, "12 months", manufacturer, qty));
            } else {
                String id = String.format("DTC%03d", oldCount++);

                int battery;
                while (true) {
                    try {
                        System.out.print("Battery (%): ");
                        String input = scanner.nextLine();

                        CommonValidation.validateEmptyField(input, "Battery field ");

                        battery = Integer.parseInt(input);

                        CommonValidation.validateNumberOutOfRange(battery, 0, 100, "Battery");

                        break;
                    } catch (EmptyFieldException | NumberOutOfRangeException e) {
                        System.out.println(e.getMessage());
                    } catch (NumberFormatException e) {
                        System.out.println("Battery must a number, please try again");
                    }
                }

                String desc;
                while (true) {
                    try {
                        System.out.print("Description: ");
                        desc = scanner.nextLine();

                        CommonValidation.validateEmptyField(desc, "Description");
                        PhoneValidation.MinLengthException(desc, "Description");

                        break;
                    } catch (EmptyFieldException e) {
                        System.out.println("Description: " + e.getMessage());
                    } catch (MinLengthException e) {
                        System.out.println(e.getMessage());
                    }
                }

                oldPhoneList.add(new OldPhone(id, name, price, "6 months", manufacturer, battery, desc));
            }
            System.out.println("Added successfully!");
        } catch (Exception e) {
            System.out.println("The application encountered some unexpected errors, please try the function again");
        }
    }

    public void update() {
        System.out.print("Enter ID to update (DTMxxx/DTCxxx): ");
        String id = scanner.nextLine().toUpperCase();

        // Kiểm tra định dạng ID (6 ký tự, bắt đầu bằng DTC hoặc DTM)
        if (!id.matches("^(DTC|DTM)\\d{3}$")) {
            System.out.println("Error: Invalid ID format!");
            return;
        }

        boolean found = false;
        if (id.startsWith("DTM")) {
            // Duyệt danh sách điện thoại mới
            for (NewPhone p : newPhoneList) {
                if (p.getId().equals(id)) {
                    updateCommonFields(p); // Cập nhật các thuộc tính chung kế thừa từ MobilePhone

                    // Cập nhật thuộc tính riêng: Quantity
                    System.out.print("Enter new quantity (Current: " + p.getQuantity() + ", Enter to skip): ");
                    String qtyInput = scanner.nextLine();
                    if (!qtyInput.trim().isEmpty()) {
                        p.setQuantity(Integer.parseInt(qtyInput.trim()));
                    }

                    found = true;
                    break;
                }
            }
        } else {
            // Duyệt danh sách điện thoại cũ
            for (OldPhone p : oldPhoneList) {
                if (p.getId().equals(id)) {
                    updateCommonFields(p); // Cập nhật các thuộc tính chung kế thừa từ MobilePhone

                    // Cập nhật thuộc tính riêng: Battery Status
                    System.out.print("Enter new battery status (Current: " + p.getBatteryStatus() + "%, Enter to skip): ");
                    String batInput = scanner.nextLine();
                    if (!batInput.trim().isEmpty()) {
                        p.setBatteryStatus(Integer.parseInt(batInput.trim()));
                    }

                    // Cập nhật thuộc tính riêng: Description
                    System.out.print("Enter new description (Current: " + p.getDescription() + ", Enter to skip): ");
                    String descInput = scanner.nextLine();
                    if (!descInput.trim().isEmpty()) {
                        p.setDescription(descInput);
                    }

                    found = true;
                    break;
                }
            }
        }

        if (found) {
            System.out.println("Updated successfully!");
        } else {
            System.out.println("Error: ID not found!");
        }
    }

    private void updateCommonFields(MobilePhone p) {
        System.out.println("--- Leave blank and press Enter to keep current value ---");

        System.out.print("Enter new name (Current: " + p.getName() + "): ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) p.setName(name);

        System.out.print("Enter new price (Current: " + p.getPrice() + "): ");
        String priceInput = scanner.nextLine();
        if (!priceInput.isEmpty()) p.setPrice(Double.parseDouble(priceInput));

        System.out.print("Enter new warranty (Current: " + p.getWarranty() + "): ");
        String warranty = scanner.nextLine();
        if (!warranty.isEmpty()) p.setWarranty(warranty);

        System.out.print("Enter new manufacturer (Current: " + p.getManufacturer() + "): ");
        String brand = scanner.nextLine();
        if (!brand.isEmpty()) p.setManufacturer(brand);
    }

    public void delete() {
        System.out.print("Enter ID to delete: ");
        String id = scanner.nextLine().toUpperCase();

        System.out.print("Are you sure? (Y/N): ");
        if (scanner.nextLine().equalsIgnoreCase("Y")) {
            boolean removed = id.startsWith("DTM") ? newPhoneList.removeIf(p -> p.getId().equals(id)) : oldPhoneList.removeIf(p -> p.getId().equals(id));

            if (removed) System.out.println("Deleted successfully!");
            else System.out.println("ID not found!");
        }
    }

    public void sortByPrice(int order) {
        Comparator<MobilePhone> priceComparator = Comparator.comparingDouble(MobilePhone::getPrice);

        if (order == 2) {
            priceComparator = priceComparator.reversed();
        }

        newPhoneList.sort(priceComparator);
        oldPhoneList.sort(priceComparator);

        System.out.println("Sorting completed! (Order: " + (order == 1 ? "Ascending" : "Descending") + ")");
    }

    public void search(int scope, int criteria) {
        List<MobilePhone> results = new ArrayList<>();

        if (scope == 1 || scope == 3) results.addAll(newPhoneList);
        if (scope == 1 || scope == 2) results.addAll(oldPhoneList);

        if (criteria == 1) {
            System.out.print("Enter min price: ");
            double min = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter max price: ");
            double max = Double.parseDouble(scanner.nextLine());
            results.removeIf(p -> p.getPrice() < min || p.getPrice() > max);
        } else if (criteria == 2) {
            System.out.print("Enter name keyword: ");
            String name = scanner.nextLine().toLowerCase();
            results.removeIf(p -> !p.getName().toLowerCase().contains(name));
        } else if (criteria == 3) { // Tìm theo hãng
            System.out.print("Enter manufacturer: ");
            String brand = scanner.nextLine().toLowerCase();
            results.removeIf(p -> !p.getManufacturer().toLowerCase().contains(brand));
        }

        if (results.isEmpty()) {
            System.out.println("No phones found matching your criteria.");
        } else {
            System.out.println("\n--- SEARCH RESULTS ---");
            for (MobilePhone p : results) {
                p.displayInfo();
            }
        }
    }

    public void calculateGrandTotal() {
        double grandTotal = 0;

        // Loop through new phones
        for (NewPhone p : newPhoneList) {
            grandTotal += p.calculateTotalPrice();
        }

        // Loop through old phones
        for (OldPhone p : oldPhoneList) {
            grandTotal += p.calculateTotalPrice();
        }

        System.out.printf("Grand total value of all phones in store: %.2f\n", grandTotal);
    }

    // Task 8: Apply discount to all old phones
    public void applyDiscountToOldPhones() {
        System.out.print("Enter discount percentage for old phones (e.g., 10 for 10%): ");
        double percentage = Double.parseDouble(scanner.nextLine());

        // Only apply to old phones
        for (OldPhone p : oldPhoneList) {
            p.applyDiscount(percentage); // Call method via interface
        }

        System.out.println("Discount applied successfully to all old phones!");
    }
}
