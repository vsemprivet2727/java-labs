import java.util.Scanner;

public class allTasks {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задание");
        int chosenTask = in.nextInt();

        switch (chosenTask) {
            case 1:
                System.out.println("Введите часы");

                int hours = in.nextInt();

                if (hours < 0) {
                    System.out.println("эй так нельзя");
                    return;
                }

                System.out.println("В секундах: " + hours * 3600);
                break;

            case 2:
                System.out.println("Введите возраст (0-100)");
                int age = in.nextInt();

                if (age<=0 || age>100) {
                    System.out.println("ты нчоооо");
                    return;
                }

                if (age<13) System.out.println("Вы ребенок");
                else if (age>13 && age<18) System.out.println("Вы подросток");
                else if (age>17 && age<65) System.out.println("Вы врослый");
                else if (age>64) System.out.println("вы старый");
                break;

            case 3:
                System.out.println("введите число");
                int num = Math.abs(in.nextInt());

                int count = 0;

                do {
                    num /= 10;
                    count++;
                } while (num>0);

                System.out.println(count);
                break;
            case 4:
                System.out.println("введите страну");
                var country = in.next();

                switch (country.toLowerCase()){
                    case "беларусь":
                        System.out.println("Минск");
                        break;
                    case "россия":
                        System.out.println("Москва");
                        break;
                    default:
                        System.out.println("не знаю");
                        break;
                }
                break;
            default:
                System.out.println("Не то");
                break;
        }

        in.close();
    }
}
