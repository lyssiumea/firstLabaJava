import static java.lang.System.out;
import java.util.Scanner;

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
        int number = validator.checkNumber("Введите целое число: ");
        String reversedNumbers = cycles.reverseListNums(number);
        System.out.println(reversedNumbers);

    }
}