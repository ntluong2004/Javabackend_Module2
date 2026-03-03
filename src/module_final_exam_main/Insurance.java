package module_final_exam_main;

public class Insurance {
    private String insuranceName;
    private String paymentDeadline;
    private double fee;
    private String purpose;
    private String typePay;
    private int startTime;

    public Insurance(String insuranceName, String paymentDeadline, double fee, String purpose, String typePay, int startTime) {
        this.insuranceName = insuranceName;
        this.paymentDeadline = paymentDeadline;
        this.fee = fee;
        this.purpose = purpose;
        this.typePay = typePay;
        this.startTime = startTime;
    }
}
