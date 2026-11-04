import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите номер задания (1-4)");
        switch (in.nextInt()) {
            case 1:
                System.out.println("Введите строку 1");
                var str1 = in.next();

                System.out.println("Введите строку 2");
                var str2 = in.next();

                if (str1.equalsIgnoreCase(str2))
                    System.out.println("Одинаковы");
                else
                    System.out.println("Не одинаковы");
                break;
            case 2:
                System.out.println("введите почту");
                var email = in.next();

                if (!email.matches("\\w+@\\w+.\\w+")) {
                    System.out.println("не похоже на почту");
                    return;
                }

                System.out.println("Ваш юзернейм: " + email.split("@")[0]);
                break;
            case 3:
                Employee[] employees = {
                    new Employee("hello", 2700),
                    new Employee("poka", 1988),
                    new Employee("privet", 2000),
                };

                Report.generateReport(employees);
                break;
            case 4:
                var str = "abba abea abca abza abxa";
                str.chars().filter(c -> c == 'a').count();
                str.
                var strs = str.split(" ");
                for (var s : strs) {
                    if (s.matches("ab[^b]a"))
                        System.out.println(s);
                }

                break;
        }
    }
}
