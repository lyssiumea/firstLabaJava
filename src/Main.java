import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Methods methods = new Methods();
        CheckInput validator = new CheckInput();

        // Задача № 2. Сумма знаков
//        int x = validator.checkNumberWithTwoDigits("Введите число с минимум двумя цифрами: ");
//        int result = methods.sumLastNums(x);
//        System.out.println("Сумма двух последних цифр: " + result);

        // Задача № 4. Есть ли позитив
//        int x = validator.checkNumber("Введите целое число: ");
//        boolean result = methods.isPositive(x);
//        System.out.println("Число " + x + " положительное? : " + result);

        // Задача № 6. Большая буква
//        char letter = validator.checkLetter("Введите символ (букву): ");
//        boolean result = methods.isUpperCase(letter);
//        System.out.println("Это заглавная буква: " + result);

        // Задача № 8. Делитель
//        int a = validator.checkNumber("Введите первое целое число (a): ");
//        int b = validator.checkNumber("Введите второе целое число (b): ");
//        boolean result = methods.isDivisor(a, b);
//        System.out.println("Одно из чисел делит другое: " + result);

        // Задача № 10. Многократный вызов
//        int sum = validator.checkNumber("Введите первое число: ");
//        for (int i = 2; i <= 5; i++) {
//            int nextNumber = validator.checkNumber("Введите число #" + i + ": ");
//            sum = methods.lastNumSum(sum, nextNumber); // cложение разрядов единиц
//            System.out.println("Текущая сумма разрядов единиц: " + sum);
//        }
//        System.out.println("Итоговый результат: " + sum);

        Conditions conditions = new Conditions();   // Задание 2. Условия

        // Задача № 2. Безопасное деление
//        int x = validator.checkNumber("Введите делимое (x): ");
//        int y = validator.checkNumber("Введите делитель (y): ");
//        double result = conditions.safeDiv(x, y);
//        System.out.println("Результат деления: " + result);

        // Задача № 4. Строка сравнения.
//        int x = validator.checkNumber("Введите первое целое число: ");
//        int y = validator.checkNumber("Введите второе целое число: ");
//        String decision = conditions.makeDecision(x, y);
//        System.out.println(decision);

        // Задача № 6. Тройная сумма
//        int x = validator.checkNumber("Введите первое целое число: ");
//        int y = validator.checkNumber("Введите второе целое число: ");
//        int z = validator.checkNumber("Введите третье целое число: ");
//        boolean result = conditions.sum3(x, y, z);
//        System.out.println("Результат: " + result);

        // Задача № 8.Возраст
//        int age = validator.checkNumber("Введите возраст: ");
//        String result = conditions.age(age);
//        System.out.println("Результат: " + result);

        // Задача № 10. Вызов дней недели
//        String day = validator.checkString("Введите название дня недели: ");
//        conditions.printDays(day);

        Cycles cycles = new Cycles();   // Задание 3. Циклы

        // Задача № 2. Числа наоборот
//        int number = validator.checkNumber("Введите целое число: ");
//        String reversedNumbers = cycles.reverseListNums(number);
//        System.out.println(reversedNumbers);

        // Задача № 4. Степень числа.
//        int base = validator.checkNumber("Введите число (основание): ");
//        int exponent = validator.checkNumber("Введите степень (может быть и отрицательной): ");
//        double result = cycles.pow(base, exponent);
//        System.out.println(base + " в степени " + exponent + " = " + result);

        // Задача № 6. Одинаковость
//        int number = validator.checkNumber("Введите число: ");
//        boolean result = cycles.equalNum(number);
//        System.out.println("Все цифры числа одинаковы: " + result);

        // Задача № 8. Левый треугольник.
//        int x = validator.checkPositiveNumber("Введите высоту треугольника: ");
//        cycles.leftTriangle(x);

        // Задача № 10. Угадайка
//        Random random = new Random();
//        int targetNumber = random.nextInt(10);
//        int attempts = 0;
//        int result = -1;
//        while (result == -1) {
//            int userGuess = validator.checkNumberInRange("Введите число от 0 до 9: ", 0, 9);
//            result = cycles.guessGame(userGuess, targetNumber, attempts);
//            if (result != -1) {
//                break;
//            }
//            attempts++;
//        }

        Arrays arrays = new Arrays();   // Задание 4. Массивы

        // Задача № 2. Поиск последнего значения.
//        int[] arr = validator.checkArray("Введите элементы массива через пробел (только положительные числа): ");
//        int x = validator.checkPositiveNumber("Введите число для поиска в массиве: ");
//        int result = arrays.findLast(arr, x);
//        if (result != -1) {
//            System.out.println("Последнее вхождение числа " + x + " находится на индексе: " + result);
//        } else {
//            System.out.println("Число " + x + " не найдено в массиве.");
//        }

        // Задача № 4. Добавление в массив.
//        //int[] arr = {1, 2, 3, 4, 5};
//        int[] arr = validator.checkArray("Введите массив целых чисел (через пробел): ");
//        int x = validator.checkPositiveNumber("Введите число для вставки: ");
//        int pos = validator.checkPositiveNumber("Введите позицию для вставки: ");
//        int[] newArr = arrays.add(arr, x, pos);
//        System.out.println("Новый массив: " + java.util.Arrays.toString(newArr));

        // Задача № 6. Реверс
        int[] arr = validator.checkArray("Введите массив положительных чисел через пробел: ");
        arrays.reverse(arr);
        System.out.println("Массив после реверса: " + java.util.Arrays.toString(arr));


    }
}