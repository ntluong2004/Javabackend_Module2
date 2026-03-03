package module2_final_exam_ver2;

public class EndowmentInsurance extends InsurancePackage {
    private String endTime;
    private String allowanceTime;

    public EndowmentInsurance(String paymentPeriod, double feeAmount, String purpose,
                              String paymentMethod, String startTime,
                              String endTime, String allowanceTime) {
        super("Endowment Insurance", paymentPeriod, feeAmount, purpose, paymentMethod, startTime);
        this.endTime = endTime;
        this.allowanceTime = allowanceTime;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEnd Time: " + endTime +
                "\nAllowance Time: " + allowanceTime;
    }
}