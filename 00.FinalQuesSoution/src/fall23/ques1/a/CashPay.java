package fall23.ques1.a;

public class CashPay extends Payment{

    public CashPay(double amount) {
        this.amount = amount;
    }
    @Override
    public double getCharge() {
        System.out.println("Cash Charge");
        return 0;
    }

}
