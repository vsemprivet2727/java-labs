package task3;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("введите число");
        int num = in.nextInt();
        in.close();

        int count = 0;

        while (num>0) {
            num /= 10;
            count++;
        }

        System.out.println(count);
    }
}
