package MultithreadingDAY2;
public class Customer {
    int balance;    
    public Customer() {
        balance = 1000;
    }   
    public synchronized void withdraw(int amt) {
        System.out.println("Going to Withdraw");
        if (balance < amt)
            System.out.println("Less balance waiting for deposit");
        try {
            wait();
        } catch (Exception e) {
            System.out.println(e);
        }        
        balance -= amt;
        System.out.println("Withdraw Completed Balance: " + balance);
    }    
    public synchronized void deposit(int amt) {
        System.out.println("Going To Deposit");
        balance += amt;
        System.out.println("Deposit Completed Balance: " + balance);
        notify();
    }
}