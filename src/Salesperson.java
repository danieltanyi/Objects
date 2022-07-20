public class Salesperson extends Employee{
    private double commissionPercentage;

    public Salesperson(String name, double salary, int age, double commissionPercentage) {
       super(name, (int) salary,age); // we use super keyword since saleperson inherit from Employee
        this.commissionPercentage = commissionPercentage;
    }

    public double getCommissionPercentage() {
        return this.commissionPercentage;
    }

    public void raiseCommission(){
        if (this.commissionPercentage < .30){
            this.commissionPercentage = this.commissionPercentage * 1.2;
        }
    }
}
