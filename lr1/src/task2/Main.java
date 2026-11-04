package task2;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите возраст (0-100)");
        int age = in.nextInt();
        in.close();

        if (age<=0 || age>100) {
            System.out.println("ты нчоооо");
            return;
        }

        if (age<13) System.out.println("Вы ребенок");
        else if (age>13 && age<18) System.out.println("Вы подросток");
        else if (age>17 && age<65) System.out.println("Вы врослый");
        else if (age>64) System.out.println("вы старый");
    }
}
