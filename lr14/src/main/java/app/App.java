package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {

    private static final Path F = Path.of("f.txt");
    private static final Path G = Path.of("g.txt");
    private static final Path H = Path.of("h.txt");

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            task1();
            task2(in);
            task3();
            task4(in);
            task5();
        } catch (IOException e) {
            System.out.println("Ошибкаb: " + e.getMessage());
        } finally {
            in.close();
        }
    }
    private static void task1() throws IOException {

        Path university = Path.of("university.txt");
        String info = """
                Университет: Универ Новая Общага
                Город: не помню
                Факультетов: 8
                Кафедр: 42
                Студентов: 12000
                """;
        Files.writeString(university, info);

        System.out.println("путь: " + university.toAbsolutePath());
        System.out.println("существует: " + Files.exists(university));
        System.out.println("Размер: " + Files.size(university));
        System.out.println("чтение: " + Files.isReadable(university));
        System.out.println("запись: " + Files.isWritable(university));
        System.out.println("содержимое");
        System.out.println(Files.readString(university));
    }
    private static void task2(Scanner in) throws IOException {
        System.out.println("Введите 10 целых чисел:");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(in.nextInt());
        }
        Files.writeString(F, join(numbers));

        List<Integer> fromFile = readInts(F);
        System.out.println("Числа из файла: " + fromFile);

        int max = Collections.max(fromFile);
        int min = Collections.min(fromFile);
        System.out.println("Максимум: " + max + ", минимум: " + min);
        System.out.println("Разность max - min = " + ((long) max - min));
    }
    private static void task3() throws IOException {

        Random rand = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(201) - 100);
        }
        Files.writeString(F, join(numbers));
        System.out.println("Файл f: " + numbers);

        List<Integer> multiplesOfSeven = new ArrayList<>();
        List<Integer> others = new ArrayList<>();
        for (int number : numbers) {
            if (number % 7 == 0) {
                multiplesOfSeven.add(number);
            } else {
                others.add(number);
            }
        }

        Files.writeString(G, join(multiplesOfSeven));
        Files.writeString(H, join(others));
        System.out.println("Файл g (кратные 7): " + multiplesOfSeven);
        System.out.println("Файл h (остальные): " + others);
    }

    private static void task4(Scanner in) throws IOException {
        Path currents = Path.of("current.txt");
        System.out.println("Введите 15 значений силы тока:");

        List<Double> values = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            values.add(in.nextDouble());
        }
        Files.writeString(currents, joinDoubles(values));

        List<Double> fromFile = readDoubles(currents);
        double sum = 0;
        for (double value : fromFile) {
            sum += value;
        }
        System.out.println("Средняя сила тока: " + (sum / fromFile.size()));
    }
    private static void task5() throws IOException {
        Random rand = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(rand.nextInt(201) - 100);
        }
        Files.writeString(F, join(numbers));
        System.out.println("Файл f: " + numbers);

        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int number : numbers) {
            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Положительных: " + positive);
        System.out.println("Отрицательных: " + negative);
        System.out.println("Нулей: " + zero);
    }

    private static String join(List<Integer> numbers) {
        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(number);
        }
        return sb.toString();
    }

    private static String joinDoubles(List<Double> values) {
        StringBuilder sb = new StringBuilder();
        for (double value : values) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(value);
        }
        return sb.toString();
    }

    private static List<Integer> readInts(Path path) throws IOException {
        List<Integer> result = new ArrayList<>();
        String content = Files.readString(path).trim();
        if (content.isEmpty()) {
            return result;
        }
        for (String token : content.split("\\s+")) {
            result.add(Integer.parseInt(token));
        }
        return result;
    }

    private static List<Double> readDoubles(Path path) throws IOException {
        List<Double> result = new ArrayList<>();
        String content = Files.readString(path).trim();
        if (content.isEmpty()) {
            return result;
        }
        for (String token : content.split("\\s+")) {
            result.add(Double.parseDouble(token));
        }
        return result;
    }
}
