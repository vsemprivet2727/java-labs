import java.util.Arrays;

enum Priority {
    LOW,
    MEDIUM,
    HIGH,
}

public class Main {
    static void main() {
        // задание 1
        Employee em = new Employee("vsemprivet", "Developer", 2700);
        System.out.println(em);

        em.raiseSalary(0.1);
        System.out.println(em);

        // задание 2
        Smartphone[] phones = {
                new Smartphone("LG", 2727, 1),
                new Smartphone("Samsa", 1080, 4),
                new Smartphone("Tecno", 200, 5),
                new Smartphone("Helloworld", 2000, 9),
                new Smartphone("ASUS", 2727, 5),
        };

        System.out.println(Arrays.stream(phones)
                .max((p, p2) -> p.getBatteryLife() - p2.getBatteryLife())
                .get().getBrand());

        double accum = 0;
        for (Smartphone p : phones) {
            accum += p.getPrice();
        }
        System.out.println(accum / phones.length);

        // задание 3
        Task[] tasks = {
                new Task("privet", Priority.LOW),
                new Task("helloworld", Priority.HIGH),
                new Task("remove hello world", Priority.HIGH),
                new Task ("write hello world", Priority.MEDIUM),
                new Task("dlskjflsjfd", Priority.LOW)
        };
        Arrays.stream(tasks)
                .filter(t -> t.priority == Priority.HIGH)
                .forEach(t -> System.out.println(t.description));
    }
}
