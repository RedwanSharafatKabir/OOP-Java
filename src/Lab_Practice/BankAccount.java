// package Lab_Practice;

public interface BankAccount {
    
    abstract void deposit();
    abstract void withDraw();
    
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
