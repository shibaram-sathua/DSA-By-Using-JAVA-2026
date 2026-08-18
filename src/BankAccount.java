public class BankAccount {
    private long accountNumber;
    private String accountHolder;
    private double balance;
    public BankAccount(String accountHolder,double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0) {
            this.balance += amount;
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            this.balance -= amount;
        }
    }
    public void displayBalance(){
        System.out.println(this.balance);
    }

    static void main(String[] args) {
        BankAccount account1 = new BankAccount("Shibaram",4000);
    }


}
