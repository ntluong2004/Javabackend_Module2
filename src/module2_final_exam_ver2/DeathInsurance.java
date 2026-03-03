package module2_final_exam_ver2;

public class DeathInsurance extends InsurancePackage {
    private String insuranceCase; // Term or Whole Life
    private String minParticipationTime;

    public DeathInsurance(String paymentPeriod, double feeAmount, String purpose,
                          String paymentMethod, String startTime,
                          String insuranceCase, String minParticipationTime) {
        super("Death Insurance", paymentPeriod, feeAmount, purpose, paymentMethod, startTime);
        this.insuranceCase = insuranceCase;
        this.minParticipationTime = minParticipationTime;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nInsurance Case: " + insuranceCase +
                "\nMin Participation Time: " + minParticipationTime;
    }
}