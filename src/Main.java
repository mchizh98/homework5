public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1 () {
        System.out.println("Задача1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2 () {
        System.out.println("Задача2");
        int clientOS = 0;
        int clientDeviceYear = 2023;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите  версию приложения для iOS по ссылке.");
        }
    } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите  версию приложения для Android по ссылке.");
                }
            }
    }
    public static void task3 () {
        System.out.println("Задача3");
        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " является високосным.");
        } else {
            System.out.println(year + " не является високосным.");
        }
    }
    public static void task4 () {
        System.out.println("Задача4");
        int deliveryDistance = 95;
        int deliveryDay = 0;

        if (deliveryDistance < 20) {
            deliveryDay = 1;
        } else if (deliveryDistance <60) {
            deliveryDay = 2;
        } else if (deliveryDistance < 100) {
            deliveryDay = 3;
        }

        if (deliveryDay == 0) {
            System.out.println("Доставка не осуществляется.");
        } else {
            System.out.println("Потребуется дней: " + deliveryDay);
        }
    }
    public static void task5 () {
        System.out.println("Задача5");
        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

    }
}