public class BankAccount {
    public int accountNumber;
    public int balance;


    public BankAccount(int paccountNumber, int pbalance){
        accountNumber=paccountNumber;
        balance=pbalance;


    }
        public void display (){
        System.out.println("Bank Account");
        }
        public void deposit (int ammount){
        balance = balance + ammount;
        System.out.println("After deposit of " + ammount + " the new balance is " + balance);
        }
        public void withdraw(int ammount){
        balance = balance - ammount;
        System.out.println("After withdraw of " + ammount + " the new balance is "+ balance);
        }
        public void getBalance (){
        System.out.println("Bank Account balance: "+ balance);
        }
        public void transfer(int ammount){
        System.out.println("Amount being Transfered:"+ ammount);
        }
}
