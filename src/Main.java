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
        int sum = validator.checkNumber("Введите первое число: ");
        for (int i = 2; i <= 5; i++) {
            int nextNumber = validator.checkNumber("Введите число #" + i + ": ");
            sum = methods.lastNumSum(sum, nextNumber); // cложение разрядов единиц
            System.out.println("Текущая сумма разрядов единиц: " + sum);
        }
        System.out.println("Итоговый результат: " + sum);


    }
}