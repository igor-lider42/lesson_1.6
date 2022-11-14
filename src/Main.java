public class Main {
    /*### Вводные данные для базовых задач
Представим, что вы работаете в небольшой компании, и к вам часто обращаются коллеги из
других отделов, чтобы вы помогли им настроить их работу.
И вот к вам приходят коллеги из бухгалтерии и просят помощи с корпоративной бухгалтерской книгой.
Каждый день месяца, включая выходные, компания тратит средства — некую сумму, причем в
бухгалтерской книге хранится сумма затрат по дням (а не каждая сумма отдельно). То есть в
книге 30 записей разных сумм. Эти суммы разнятся от 100 000 до 200 000.
Ваш коллега по отделу написал код, который генерирует массив из 30 случайных чисел, и
предложил прежде, чем писать программу для настоящей бухгалтерской книги,
проверить всё на случайных числах от 100 000 до 200 000.
Для получения массива случайных чисел достаточно объявить массив и вызвать указанный ранее метод.
Метод инициализирует ваш массив и заполнит его случайными значениями от 100_000 до 200_000.
*/
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int[] weightsCopy = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        int januaryWeights = weights[0];
        System.out.println(januaryWeights);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("Массивы одинаковые");
        } else {
            System.out.println("Массивы разные");
        }
        for (int i = 0; i < weightsCopy.length; i++) {
            System.out.println(weightsCopy[i]);
        }
        int maxWeight = -1;
        for (int current : weights) {
            if (current > maxWeight) {
                maxWeight = current;
            }
        }
        System.out.println(maxWeight);
        for (int i = 0; i < weights.length - 1 && weights[i + 1] != 0; i++) {
            System.out.println(weights[i + 1] - weights[i]);


        }
        // Задание 1
//Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
//Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
//в формате: «Сумма трат за месяц составила … рублей»


    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int sum = 0;
        int[] arr = generateRandomArray();
        for (int value : arr) {
            sum += value;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
/*           Задание 2
Найти минимальную и максимальную трату за день.
Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
в формате: «Минимальная сумма трат за день составила … рублей.
Максимальная сумма трат за день составила … рублей».*/
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];

        for (int element : arr) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
        }
        System.out.println("«Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("«Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        /*А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
Нужно написать программу, которая посчитает среднее значение трат за месяц
(то есть сумму всех трат за месяц поделить на количество дней),
и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
**Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым,
а дробным числом).*/
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum / (float) arr.length);
    }

    public static void task4() {
//        ### Задание 4
//Отойдем от подсчетов.
//В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и ФИО сотрудников
// начали отображаться в обратную сторону.
// Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
//Данные с именами сотрудников хранятся в виде массива символов (char[]).
//Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в
// корректном виде. В качестве данных для массива используйте:
//char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
//В результате в консоль должно быть выведено "Ivanov Ivan".
//**Важно**: не используйте дополнительные массивы для решения этой задачи.
// Необходимо корректно пройти по массиву циклом и распечатать его элементы в правильном порядке.
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

    }

}
