package sample;

public class Employee extends Controller {
    Double salary;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee(int id, Double salary, String name) {
        super(id, name);
        this.salary= salary;
    }

    @Override
    public void toStringg() {
        System.out.println("ID: "+id +"Salary: "+salary + "Name "+name );

    }
}
