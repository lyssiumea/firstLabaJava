import java.util.Scanner;

public class CheckInput {   // Метод со всеми проверками

    private final Scanner scanner = new Scanner(System.in);

    public int checkNumber(String message) {    // проверка целого числа
        int number;
        while (true) {
            System.out.print(message);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println("Ошибка: введите корректное целое число.");
                scanner.next();
            }
        }
        return number;
    }

    public int checkNumberWithTwoDigits(String message) {    // число содержит хотя бы две цифры
        int number;
        while (true) {
            number = checkNumber(message);
            if (Math.abs(number) >= 10) {
                break;
            } else {
                System.out.println("Ошибка: введите число с минимум двумя цифрами.");
            }
        }
        return number;
    }

    public char checkLetter(String prompt) {    // один символ и это буква
        char letter;
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                letter = input.charAt(0);
                break;
            } else if (input.length() != 1) {
                System.out.println("Ошибка: введите ровно один символ.");
            } else if (!Character.isLetter(input.charAt(0))) {
                System.out.println("Ошибка: введите букву, а не цифру или другой символ.");
            }
        }
        return letter;
    }


}
