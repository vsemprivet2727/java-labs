package task1;

import java.util.Scanner;

public class Main {
    void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите часы");
        in.close();

        int hours = in.nextInt();

        if (hours < 0) {
            System.out.println("эй так нельзя");
            return;
        }

        System.out.println("В секундах: " + hours * 3600);
    }
}