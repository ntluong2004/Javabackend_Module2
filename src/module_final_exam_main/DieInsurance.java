package module_final_exam_main;

public class DieInsurance extends Insurance {

    private String caseToPayInsurance, minParticipationTime;

    public DieInsurance(
            String insuranceName,
            String paymentDeadline,
            double fee,
            String purpose,
            String typePay,
            int startTime,
            String casePayInsurance,
            String minParticipationTime) {
        super(
                insuranceName,
                paymentDeadline,
                fee,
                purpose,
                typePay,
                startTime);
        this.caseToPayInsurance = casePayInsurance;
        this.minParticipationTime = minParticipationTime;


    }
}
