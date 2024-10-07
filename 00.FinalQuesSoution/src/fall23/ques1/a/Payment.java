package fall23.ques1.a;

public abstract class Payment implements iTransaction {
    double amount;
    String currency = "BDT";

    @Override
    public void give()
    { //Write code here
        double nAmount = getTax()+getCharge();
        amount += nAmount;
         System.out.println(currency+" "+amount+" is paid");
    }
    @Override public void receive()
         {
             System.out.println("[Nothing to receive]");
         }
    public abstract double getCharge();

    public double getTax()
        { //Write code here
            double tax;
           return tax =amount* (15.6/100);


        }

}