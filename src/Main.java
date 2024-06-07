import java.time.LocalDate;

public class Main {

    public static String enterYear(int year) {
        if ((year > 1584 && year % 4 == 0 && year % 100 != 0) || (year > 1584 && year % 400 == 0))
            return "Этот год високосный";
        else
            return "Год не високосный";
    }

    public static void selectOS(int clientOS, int clientDeviceYear) {
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
        boolean distance1 = (deliveryDistance < 20);
        if (distance1)
            return "Потребуется один день";
        boolean distance2 = (deliveryDistance < 60 && deliveryDistance >= 20);
        if (distance2)
            return "Потребуется два дня";
        boolean distance3 = (deliveryDistance <= 100 && deliveryDistance >= 60);
        if (distance3)
            return "Потребуется три дня";
        if (deliveryDistance > 100)
            return "Доставки нет";
        return "";
    }

    public static void main(String[] args) {
        System.out.println("Привет, наставник!:)");
        System.out.println("Task 1");
        int year = 2024;
        System.out.println(year + " - " + enterYear(year));
        System.out.println("Task 2");
        int clientOS = 1;
        int clientDeviseYear = LocalDate.now().getYear();
        selectOS(clientOS, clientDeviseYear);
        System.out.println("Task 3");
        int deliveryDistance = 100;
        System.out.println(returnNumberDaysDelivery(deliveryDistance));
    }
}
