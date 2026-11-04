public class Report {
    static void generateReport(Employee[] employees) {
        for  (Employee em : employees) {
            System.out.printf("%-10s:%10.2f", em.fullname, em.salary);
            System.out.println();
        }
    }
}
