public class Employee extends Person {
    protected double salary;


    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }


    public void raiseSalary(){
        this.salary = this.salary * 1.2;
    }
}
