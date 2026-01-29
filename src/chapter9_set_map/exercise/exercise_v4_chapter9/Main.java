package chapter9_set_map.exercise.exercise_v4_chapter9;

public class Main {
    static PhoneService service = new PhoneService();

    static void main() {
        int choice;
        do {
            System.out.println("\n-- PHONE MANAGEMENT PROGRAM --");
            System.out.println("1. View List");
            System.out.println("2. Add New");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Sort by Price");
            System.out.println("6. Search");
            System.out.println("7. Total Amount");
            System.out.println("8. Discount for Old Phones");
            System.out.println("9. Exit");
            choice = ValidationUtil.functionCheck(1, 9);

            switch (choice) {
                case 1:
                    ShowList();
                    break;
                case 2:
                    AddNew();
                    break;
                case 3:
                    service.update();
                    break;
                case 4:
                    service.delete();
                    break;
                case 5:
                    SortByPrice();
                    break;
                case 6:
                    Search();
                    break;
                case 7:
                    service.calculateGrandTotal();
                    break;
                case 8:
                    service.applyDiscountToOldPhones();
                    break;
                case 9:
                    System.out.println("Goodbye!");
                    break;
            }
        } while (choice != 9);
    }

    public static void ShowList() {
        int choice;
        do {
            System.out.println("\n--- VIEW LIST ---");
            System.out.println("1. View All");
            System.out.println("2. View Old Phones");
            System.out.println("3. View New Phones");
            System.out.println("4. Back to Main Menu");
            choice = ValidationUtil.functionCheck(1, 4);
            if (choice != 4) service.showList(choice);
        } while (choice != 4);
    }

    public static void AddNew() {
        int choice;
        do {
            System.out.println("\n--- ADD NEW ---");
            System.out.println("1. Add Old Phone");
            System.out.println("2. Add New Phone");
            System.out.println("3. Back to Main Menu");
            choice = ValidationUtil.functionCheck(1, 3);
            if (choice != 3) service.addNew(choice);
        } while (choice != 3);
    }

    public static void SortByPrice() {
        int choice;
        do {
            System.out.println("\n--- SORT BY PRICE ---");
            System.out.println("1. Ascending (Tăng dần)");
            System.out.println("2. Descending (Giảm dần)");
            System.out.println("3. Back to main menu");

            // Sử dụng Util.functionCheck của bạn
            choice = ValidationUtil.functionCheck(1, 3);

            if (choice == 1 || choice == 2) {
                service.sortByPrice(choice);
                ShowList();
            }
        } while (choice != 3);
    }

    public static void Search() {
        int scope;
        do {
            System.out.println("\n-- SEARCH --");
            System.out.println("1. Search all phones");
            System.out.println("2. Search old phones");
            System.out.println("3. Search new phones");
            System.out.println("4. Back to main menu");

            scope = ValidationUtil.functionCheck(1, 4);

            if (scope != 4) {
                int criteria;
                do {
                    System.out.println("\n-- SEARCH CRITERIA --");
                    System.out.println("1. Search by price (Nhập khoảng giá)");
                    System.out.println("2. Search by name");
                    System.out.println("3. Search by manufacturer");
                    System.out.println("4. Back to Search menu");

                    criteria = ValidationUtil.functionCheck(1, 4);

                    if (criteria != 4) {
                        service.search(scope, criteria);
                    }
                } while (criteria != 4);
            }
        } while (scope != 4);
    }
}
