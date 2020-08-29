public class CheckingAccount implements BankAccount{
    double insufficientFundsFee = 230000.00;
    double balance = 500000.00;

    @Override
    public void deposit() {
        System.out.println("amount - " + balance);
    }
    
    public void processCheck(){
        
    }
    
    @Override
    public void withDraw() {
        System.out.println("withdraw - " + (balance-insufficientFundsFee) + "\n");
    }
}