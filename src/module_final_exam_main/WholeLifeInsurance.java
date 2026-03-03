package module_final_exam_main;

public class WholeLifeInsurance extends Insurance {

    String endTime, subsidyPeriod;

    public WholeLifeInsurance(
            String insuranceName,
            String paymentDeadline,
            double fee,
            String purpose,
            String typePay,
            int startTime,
            String endTime,
            String subsidyPeriod) {
        super(
                insuranceName,
                paymentDeadline,
                fee,
                purpose,
                typePay,
                startTime);
        this.endTime = endTime;
        this.subsidyPeriod = subsidyPeriod;
    }
}
