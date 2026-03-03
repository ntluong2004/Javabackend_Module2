package module2_final_exam_ver2;

import java.io.*;
import java.util.*;
import java.text.*;

public class InsuranceManager {
    private static List<Customer> customerList = new ArrayList<>();
    private static SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

    public static void main(String[] args) {
        sdf.setLenient(false);
        processFile("src/module2_final_exam_ver2/input.txt");

        Scanner scanner = new Scanner(System.in);

        // Requirement 3.1: Search by ID Card
        System.out.print("Enter ID Card to search: ");
        String searchId = scanner.nextLine();
        searchById(searchId);

        // Requirement 3.2: Highest Fee Packages
        System.out.println("\n--- Highest Fee Insurance Packages ---");
        displayHighestFees();
    }

    public static void processFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName));
             PrintWriter errWriter = new PrintWriter(new FileWriter("src/module2_final_exam_ver2/error.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(", ");
                StringBuilder errorLog = new StringBuilder();

                // Requirement 5: Date validation (MM/dd/yyyy)
                if (!isValidDate(data[1])) errorLog.append("Invalid DOB. ");
                if (!isValidDate(data[9])) errorLog.append("Invalid Start Time. ");
                if (!data[10].equals("null") && !isValidDate(data[10])) errorLog.append("Invalid End Time. ");

                // Requirement 5: Fee validation (1M < fee < 10B)
                double fee = 0;
                try {
                    fee = Double.parseDouble(data[6]);
                    if (fee <= 1000000 || fee >= 10000000000L) errorLog.append("Fee out of range. ");
                } catch (Exception e) { errorLog.append("Fee must be a number. "); }

                // Requirement 5: Redundant data check per package type
                String type = data[4];
                if (type.equals("S") && (!data[11].equals("null") || !data[12].equals("null") || !data[13].equals("null"))) {
                    errorLog.append("Endowment package contains redundant data. ");
                }

                if (errorLog.length() > 0) {
                    // Requirement 6: Export all errors on the same line
                    errWriter.println(line + " -> Errors: " + errorLog.toString());
                } else {
                    InsurancePackage pkg = null;
                    if (type.equals("T")) pkg = new DeathInsurance(data[5], fee, data[7], data[8], data[9], data[12], data[13]);
                    else if (type.equals("S")) pkg = new EndowmentInsurance(data[5], fee, data[7], data[8], data[9], data[10], data[14]);
                    else if (type.equals("H")) pkg = new TermInsurance(data[5], fee, data[7], data[8], data[9], data[10], data[11]);

                    if (pkg != null) customerList.add(new Customer(data[0], data[1], data[2], data[3], pkg));
                }
            }
        } catch (IOException e) { e.printStackTrace(); }
    }

    private static boolean isValidDate(String dateStr) {
        try { sdf.parse(dateStr); return true; } catch (ParseException e) { return false; }
    }

    public static void searchById(String id) {
        for (Customer c : customerList) {
            if (c.getIdCard().equals(id)) {
                c.displayInfo();
                return;
            }
        }
        System.out.println("No customer found with ID: " + id);
    }

    public static void displayHighestFees() {
        if (customerList.isEmpty()) return;
        double maxFee = customerList.stream().mapToDouble(c -> c.getPkg().getFeeAmount()).max().orElse(0);
        for (Customer c : customerList) {
            if (c.getPkg().getFeeAmount() == maxFee) {
                System.out.println(c.getPkg().toString());
                System.out.println("***********************");
            }
        }
    }
}