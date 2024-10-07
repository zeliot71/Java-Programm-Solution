package fall23.ques1.a;

public class CreditCardPay extends Payment{
    public CreditCardPay(double amount){
        this.amount = amount;
    }

    @Override
    public double getCharge() {
        System.out.println("CreditCardPay charge");
        return ( amount* (2.5/100));
    }
}
