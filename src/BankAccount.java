public class BankAccount {

    /**
     *  Add the following functionality
     *
     *  Withdraw method
     *  Deposit method
     *  Getter methods
     *  Constructor
     *
     *  Create a Main class that makes a Bank Account instance
     *  Withdraw a certain amount using the withdrawal method
     *  Print out the resulting balance
     *
     *  Note: The Bank Account attributes should not be directly accessible
     *
     */


   private   String owner;
   private double balance;

    public BankAccount(String owner, int startingbalance) {
        this.owner = owner;
        this.balance = Math.max(startingbalance,0) ;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit (double amt){
        if (amt >0){
            this.balance =this.balance + amt;
            return amt;
        }
        return 0;
    }
    public double withdraw(double amt){
        if (amt<= this.balance){
            this.balance =this.balance - amt;
            return amt;
        }
        return 0;
    }
}
