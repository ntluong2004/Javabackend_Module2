package module2_final_exam_ver2;

public class TermInsurance extends InsurancePackage {
    private String endTime;
    private String attachedProducts;

    public TermInsurance(String paymentPeriod, double feeAmount, String purpose,
                         String paymentMethod, String startTime,
                         String endTime, String attachedProducts) {
        super("Term Insurance", paymentPeriod, feeAmount, purpose, paymentMethod, startTime);
        this.endTime = endTime;
        this.attachedProducts = attachedProducts;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEnd Time: " + endTime +
                "\nAttached Products: " + attachedProducts;
    }
}
