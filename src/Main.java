import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        CheckInput validator = new CheckInput();

        // Задача № 2. Сумма знаков
        int x = validator.checkNumberWithTwoDigits("Введите число с минимум двумя цифрами: ");
        int result = methods.sumLastNums(x);
        System.out.println("Сумма двух последних цифр: " + result);
    }
}