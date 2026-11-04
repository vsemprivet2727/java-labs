public class Employee {
    StringBuilder fullname = new StringBuilder(15);
    double salary;
    Employee(String fullname, double salary) {
        this.fullname = this.fullname.append(fullname);
        this.salary = salary;
    }
}
