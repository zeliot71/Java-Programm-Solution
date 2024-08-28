class BankAcc{
    private int accNum;
    private double balance;
    private String accHolder;

    BankAcc(int accNum, double balance, String accHolder){
        this.accNum = accNum;
        this.balance = balance;
        this.accHolder = accHolder;
    }

    final int getAccNum(){
        return accNum;
    }
    public double getBalance(){
        return balance;
    }
    public String getAccHolder(){
        return accHolder;
    }


    public double updateBalance(double deposit){
        return balance = balance + deposit;
    }
    public double withdrawBalance(double withdrawAmount){
        if(balance - withdrawAmount < 0){
            System.out.println("Insufficient Balance");
        }
        else{
            balance -= withdrawAmount;

        }
        return balance;
    }

}
class SavingsAcc extends BankAcc{
    public double haramInterest;

    SavingsAcc(int accNum, double balance, String accHolder, double haramInterest){
        super(accNum, balance, accHolder);
        this.haramInterest = haramInterest;
    }

    public double updateBalance(double haramInterest){
        return this.haramInterest+ super.updateBalance(haramInterest);
    }
}

public class BankMain {
    public static void main(String[] args) {

    }
}
