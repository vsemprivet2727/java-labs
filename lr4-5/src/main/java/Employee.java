public class Employee {
    String name;
    String position;
    double salary;

    Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        if (percent < 0 || percent > 1) return;
        this.salary += this.salary*percent;
    }

    public String toString() {
        return this.name + ": " +  this.position + ", " + this.salary;
    }
}
