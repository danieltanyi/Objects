public class Employee {
    String name;
    String location;
    double salary;
    int age;       //all these fields are non-static attributes b/c they vary
                    // on each employee instance

    public Employee(String name, String location, double salary, int age) {
        this.name = name;
        this.location = location;
        this.salary = salary;
        this.age = age;
    }
    void raiseSalary(){
        this.salary =this.salary * 1.2;  // i raise the salary by 1.2
    }
}
