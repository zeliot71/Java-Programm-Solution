package fall23.ques1.a;

public class Test {
    public static void main(String[] args) {
        //System.out.println();

        CheckPay p = new CheckPay(500);
       // System.out.println(p.amount);
        p.give();
        CashPay cp = new CashPay(500);
        cp.give();
        CreditCardPay cc = new CreditCardPay(500);
        cc.give();
    }
}
