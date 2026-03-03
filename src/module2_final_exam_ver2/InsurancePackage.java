package module2_final_exam_ver2;

public abstract class InsurancePackage {
    protected String packageName;
    protected String paymentPeriod;
    protected double feeAmount;
    protected String purpose;
    protected String paymentMethod;
    protected String startTime;

    public InsurancePackage(String packageName, String paymentPeriod, double feeAmount,
                            String purpose, String paymentMethod, String startTime) {
        this.packageName = packageName;
        this.paymentPeriod = paymentPeriod;
        this.feeAmount = feeAmount;
        this.purpose = purpose;
        this.paymentMethod = paymentMethod;
        this.startTime = startTime;
    }

    public double getFeeAmount() { return feeAmount; }

    @Override
    public String toString() {
        return "Package Name: " + packageName +
                "\nPeriod: " + paymentPeriod +
                "\nFee: " + (long)feeAmount +
                "\nPurpose: " + purpose +
                "\nMethod: " + paymentMethod +
                "\nStart Time: " + startTime;
    }
}