package Lab_Practice;

abstract public class BankAccount {
    
    double balance = 500000.00;
    
    abstract void deposit();
    abstract void withDraw();
    
}

class CheckingAccount extends BankAccount {
    
    double insufficientFundsFee = 230000.00;
    
    @Override
    void deposit() {
        System.out.println("amount - " + balance);
    }
    
    public void processCheck(){
        
    }
    
    @Override
    void withDraw() {
        System.out.println("withdraw - " + (balance-insufficientFundsFee) + "\n");
    }
}

class SavingAccount extends BankAccount {
    
    double annualInterestRate = 0.24;
    
    @Override
    void deposit() {
        System.out.println("amount - " + balance);
    }
    
    public void depositMonthlyInterest(){
        System.out.println("Monthly Interest : "+annualInterestRate/12);
    }
    
    @Override
    void withDraw() {
        System.out.println("withdraw - " + (balance-230000.00));
    }
}
class testBankAccount {
    public static void main(String [] args){
        BankAccount obj1,obj2;
        SavingAccount obj3 = new SavingAccount();
        
        String owner = "Sharafat";
        System.out.println("owner - "+owner+"\n");
        
        obj1 = new CheckingAccount();
        obj1.deposit();
        obj1.withDraw();
        
        obj2 = new SavingAccount();
        obj2.deposit();
        obj3.depositMonthlyInterest();
        obj2.withDraw();
    }
}
