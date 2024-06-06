import java.time.LocalDate;

public class Main {
    public static void hello() {
        System.out.println("Привет, наставник!:)");
    }

    public static int enterYear() {
        return 2024;
    }

    public static String selectOS(int clientOS, int clientDeviceYear) {
        if (clientOS == 1 && clientDeviceYear >= 2015)
            return "Установите версию приложения для Android по ссылке";
        if (clientDeviceYear < 2015 && clientOS == 1)
            return "Установите облегченную версию приложения для Android по ссылке";
        if (clientOS == 0 && clientDeviceYear >= 2015)
            return "Установите версию приложения для iOS по ссылке";
        if (clientDeviceYear < 2015 && clientOS == 0)
            return "Установите облегченную версию приложения для iOS по ссылке";
        return "";
    }

    public static void main(String[] args) {
        System.out.println("Task 1");
        int yearStart = 1584;
        int everyFourth = 4;
        int hundred = 100;
        int fourHundred = 400;
        if ((enterYear() > yearStart && enterYear() % everyFourth == 0 && enterYear() % hundred != 0) || (enterYear() > yearStart && enterYear() % fourHundred == 0)) {
            System.out.println("Этот год високосный");
        } else {
            System.out.println("Год не високосный");
        }
        System.out.println("Task 2");
        int clientOS = 1;
        int clientDeviseYear = LocalDate.now().getYear();
        String result = selectOS(clientOS, clientDeviseYear);
        System.out.println(result);

        System.out.println("Task 3");

    }
}