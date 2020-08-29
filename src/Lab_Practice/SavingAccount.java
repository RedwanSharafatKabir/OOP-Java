public class SavingAccount implements BankAccount{
    double annualInterestRate = 0.24;
    double balance = 500000.00;

    @Override
    public void deposit() {
        System.out.println("amount - " + balance);
    }
    
    public void depositMonthlyInterest(){
        System.out.println("Monthly Interest : "+annualInterestRate/12);
    }
    
    @Override
    public void withDraw() {
        System.out.println("withdraw - " + (balance-230000.00));
    }
}