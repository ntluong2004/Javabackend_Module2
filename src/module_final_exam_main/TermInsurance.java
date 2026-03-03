package module_final_exam_main;

public class TermInsurance extends Insurance {

    private String endTime, includedProducts;

    public TermInsurance(

            String insuranceName,
            String paymentDeadline,
            double fee,
            String purpose,
            String typePay,
            int startTime,
            String endTime,
            String includedProducts
    ) {
        super(
                insuranceName,
                paymentDeadline,
                fee,
                purpose,
                typePay,
                startTime);
        this.endTime = endTime;
        this.includedProducts = includedProducts;
    }
}
