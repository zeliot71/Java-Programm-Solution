package fall23.ques1.a;

public class CheckPay extends Payment
{
    public CheckPay(double amount){
        this.amount = amount;
    }

    @Override
    public double getCharge() {
        System.out.println("CheckPay");
        return 10;
    }
}
