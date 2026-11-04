package task1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];

        arr = Arrays.stream(arr)
                .map(num -> rand.nextInt(10))
                .toArray();

        for (int num : arr)
            System.out.print(num+" ");

        System.out.println("Кол-во четных: " + Arrays.stream(arr)
                .filter(num -> num % 2 == 0)
                .toArray()
                .length);
//        int count = 0;
//        for (int num : arr)
//            count = num%2==0? count+1 : count;
//        System.out.println("Кол-во четных: " + count);
    }
}
