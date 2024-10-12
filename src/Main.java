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
        char letter = validator.checkLetter("Введите символ (букву): ");
        boolean result = methods.isUpperCase(letter);
        System.out.println("Это заглавная буква: " + result);

    }
}