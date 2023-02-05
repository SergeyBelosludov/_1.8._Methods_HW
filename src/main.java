import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

//        Задание 1.
//        Реализуйте метод, который получает в качестве параметра год, а затем проверяет,
//        является ли он високосным, и выводит результат в консоль.
//        Эту проверку вы уже реализовывали в задании по условным операторам.
//        Теперь проверку нужно обернуть в метод и использовать год, который приходит в виде параметра.
//        Результат программы выведите в консоль. Если год високосный,
//        то должно быть выведено "номер года — високосный год". Если год не високосный,
//        то, соответственно: "номер года — не високосный год".
//        Подсказку с выполнением задания вы можете найти в шпаргалке урока.
//            Критерии оценки
//          – Метод реализован корректно.
//          – Название метода начинается с глагола, написано в camelCase и описывает действия метода
//          – При изменении значения года программа выводит корректный результат.
//          – В консоль выведены результат программы.

        int year = 2023;
        printAboutYear(year);

//        Задание 2.
//        Вспомним задание 2 по условным операторам, где нам необходимо было предложить пользователю
//        облегченную версию приложения.
//        -- Текст прошлого задания:
//               К нам пришли коллеги и сообщили, что нам нужно знать не только операционную систему телефона,
//               но и год его создания: от этого зависит, подойдет ли приложение для телефона
//               или оно просто не установится.
//               Если телефон произведен с 2015 по нынешний год, то приложение будет работать корректно.
//               Если телефон произведен ранее 2015 года, то клиенту нужно посоветовать установить облегченную
//               версию приложения.
//               Ваша задача: написать программу, которая выдает соответствующее сообщение клиенту при наличии
//               двух условий — операционной системы телефона (iOS или Android) и года производства.
//               Если год выпуска ранее 2015 года, то к сообщению об установке нужно добавить информацию об
//               облегченной версии.
//               Например, для iOS оно будет звучать так:
//               «Установите облегченную версию приложения для iOS по ссылке».
//               А для Android так:
//               «Установите облегченную версию приложения для Android по ссылке».
//               При этом для пользователей с телефоном с 2015 года выпуска нужно вывести обычное предложение
//               об установке приложения.
//               Для обозначения года создания используйте переменную clientDeviceYear,
//               где необходимо указать 2015 год.
//               Важно: вложенность больше двух этажей не допускается (условный оператор внутри условного оператора).
//        Напишите метод, куда подаются два параметра: тип операционной системы (ОС) ( 0 — iOS или 1 — Android )
//        и год выпуска устройства.
//        Если устройство старше текущего года, предложите ему установить lite-версию (облегченную версию).
//        Текущий год можно получить таким способом:
//             int currentYear = LocalDate.now().getYear();
//        Или самим задать значение вручную, введя в переменную числовое значение.
//        В результате программа должна выводить в консоль в зависимости от исходных данных, какую версию приложения
//        (обычную или lite) и для какой ОС (Android или iOS) нужно установить пользователю.
//        Подсказку с выполнением задания вы можете найти в шпаргалке урока.
//        Критерии оценки:
//           – Метод написан корректно.
//           – Метод выполняет условие задания.
//           – Результат в консоль выводится согласно всем вводным условиям.

        indicatesInstallOs(0, 2023);

//        Задание 3.
//        Возвращаемся к любимой многими задаче на расчет дней доставки банковской карты от банка.
//        -- Текст прошлого задания:
//                Вернемся к делам банковским. У нас хороший банк, поэтому для наших клиентов мы организуем доставку
//                банковских карт на дом с четкой датой доставки. Чтобы известить клиента о том, когда будет
//                доставлена его карта, нам нужно знать расстояние от нашего офиса до адреса доставки.
//                Правила доставки такие:
//                Доставка в пределах 20 км занимает сутки.
//                Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
//                Доставка в пределах от 60 км до 100 км добавляет еще одни сутки.
//                То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
//                Напишите программу, которая выдает сообщение в консоль:
//                "Потребуется дней: " + срок доставки
//                Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
//        Наша задача — доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает
//        итоговое количество дней доставки.
//        Критерии оценки:
//          – Метод написан корректно.
//          – Все условия задачи соблюдены.

        int deliveryDistance = 95;
        printAboutDeliveryDays(deliveryDistance);
    }

    // Методы для Задания 1.
    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    private static void printLeapYear(int year) {
        System.out.println(year + " year is a leap year");
    }
    private static void printNotLeapYear(int year) {
        System.out.println(year + " year is not a leap year");
    }
    private static void printAboutYear(int year) {
        if (isLeapYear(year)) {
            printLeapYear(year);
        } else {
            printNotLeapYear(year);
        }
    }

    // Методы для Задания 2.
    private static void indicatesInstallOs(int clientOS, int clientDeviceYear) {
        String finalString = printFinalString(clientOS, clientDeviceYear);
        System.out.println(finalString);
    }
    private static String printFinalString(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        StringBuilder stringBuilder = new StringBuilder();
        if (clientDeviceYear < currentYear) {
            stringBuilder.append("Install the lite version of the app by following the link ");
        } else {
            stringBuilder.append("Install the full version of the app by following the link ");
        }
        if (clientOS == 0) {
            stringBuilder.append(" for iOS");
        } else {
            stringBuilder.append(" for Android");
        }
        return stringBuilder.toString();
    }

// Методы для Задания 3.

    private static void calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("It will take days: 1");
        } else if (deliveryDistance <= 60) {
            System.out.println("It will take days: 2");
        } else if (deliveryDistance <= 100) {
            System.out.println("It will take days: 3");
        }
    }
    private static void printError(int deliveryDistance) {
        if (deliveryDistance > 100 || deliveryDistance <= 0) {
            System.out.println("Contact customer support");
        }
    }
    private static boolean isDelivery(int deliveryDistance) {
        return deliveryDistance > 0 && deliveryDistance <= 100;
    }
    private static void printAboutDeliveryDays(int deliveryDistance) {
        if (isDelivery(deliveryDistance)) {
            calculateDeliveryDays(deliveryDistance);
        } else {
            printError(deliveryDistance);
        }
    }
}
