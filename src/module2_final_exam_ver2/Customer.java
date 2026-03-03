package module2_final_exam_ver2;

public class Customer {
    private String fullName;
    private String dateOfBirth;
    private String address;
    private String idCard;
    private InsurancePackage pkg;

    public Customer(String fullName, String dateOfBirth, String address, String idCard, InsurancePackage pkg) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.idCard = idCard;
        this.pkg = pkg;
    }

    public String getIdCard() { return idCard; }
    public InsurancePackage getPkg() { return pkg; }

    public void displayInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("DOB: " + dateOfBirth);
        System.out.println("Address: " + address);
        System.out.println("ID Card: " + idCard);
        System.out.println(pkg.toString());
    }
}
