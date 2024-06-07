import java.time.LocalDate;

public class Main {

    public static void checkLeapYear(int year) {
        if ((year > 1584 && year % 4 == 0 && year % 100 != 0) || (year > 1584 && year % 400 == 0)) {
            System.out.println("Этот год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }

    public static int clientDeviceYear = LocalDate.now().getYear();

    public static void selectOS(int clientOS) {
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static String returnNumberDaysDelivery(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return "Потребуется один день";
        }
        if (deliveryDistance < 60 && deliveryDistance >= 20) {
            return "Потребуется два дня";
        }
        if (deliveryDistance <= 100 && deliveryDistance >= 60) {
            return "Потребуется три дня";
        }
        if (deliveryDistance > 100) {
            return "Доставки нет";
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println("Привет, наставник!:)");
        System.out.println("Task 1");
        int year = 2024;
        System.out.printf(year + " - ");
        checkLeapYear(year);
        System.out.println("Task 2");
        int clientOS = 1;
        selectOS(clientOS);
        System.out.println("Task 3");
        int deliveryDistance = 100;
        System.out.println(returnNumberDaysDelivery(deliveryDistance));
    }
}
