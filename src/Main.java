import java.util.Random;

public class Main {
    public static void main(String[] args) {
        {// задние 1 и 2

            Random random = new Random();
            int clientOs = random.nextInt(2);
            Random random1 = new Random();
            int age = 2015 + random1.nextInt(2023 - 2015);
            System.out.println(clientOs);
            System.out.println(age);
            if (age > 2015) {
                if (clientOs == 0) {
                    System.out.println("Установите версию для IOS");
                } else {
                    System.out.println("Установите версию для Android");
                }
            } else if (clientOs == 0) {
                System.out.println("Установите облегченную версию для IOS");
            } else {
                System.out.println("Установите облегченную версию для Android");

            }
        }
        {// задание 3

            int age = 2021;
            if (age % 4 == 0 && age % 100 != 0) {
                System.out.println("високосный");
            } else {
                if (age % 4 == 0 && age % 400 == 0) {
                    System.out.println("високосный");
                } else {
                    System.out.println("не високосный");
                }
            }
        }
        {//задание 4
        int distance1 = 20;
        int distance2 = 60;
        int distance3 = 100;
        int deliveryDistance = 95;
        int day = 0;
        if (deliveryDistance<100 && deliveryDistance<60 && deliveryDistance<=20){
            day = day + 1;
            System.out.println(day + " день будет доставка");
        }
        else if (deliveryDistance<100 && deliveryDistance<60 && deliveryDistance>20){
            day = day + 2;
            System.out.println(day + " дня будет доставка");
        }
        else if (deliveryDistance<100 && deliveryDistance>60){
            day= day + 3;
            System.out.println(day + " дня будет доставка");
        }}
        // задание 4
        int month = 13;
        switch (month){
            case 1 :
                System.out.println("зима");
                break;
            case 2 :
                System.out.println("зима");
                break;
            case 3 :
                System.out.println("весна");
                break;
            case 4 :
                System.out.println("весна");
                break;
            case 5 :
                System.out.println("весна");
                break;
            case 6 :
                System.out.println("лето");
                break;
            case 7 :
                System.out.println("лето");
                break;
            case 8 :
                System.out.println("лето");
                break;
            case 9 :
                System.out.println("осень");
                break;
            case 10 :
                System.out.println("осень");
                break;
            case 11 :
                System.out.println("осень");
                break;
            case 12 :
                System.out.println("зима");
                break;
            default:
                System.out.println("вы ошиблись");
        }















    }
}
































