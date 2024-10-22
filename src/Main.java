import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

class CheckInput {   // Класс проверок

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

    public char checkLetter(String prompt) {  // только 1 символ буква
        char letter;
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                letter = input.charAt(0); // Возвращаем символ, если это буква
                break;
            } else if (input.length() != 1) {
                System.out.println("Ошибка: введите ровно один символ.");
            } else {
                System.out.println("Ошибка: введите букву, а не цифру или другой символ.");
            }
        }
        return letter;
    }

    public String checkString(String prompt) {    // проверка строки
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (input.matches("[a-zA-Zа-яА-Я]+")) {
                return input;
            } else {
                System.out.println("Ошибка: ввод должен содержать только буквы. Попробуйте снова.");
            }
        }
    }

    public int checkPositiveNumber(String prompt) { // проверка что число положительное
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0) {
                    break;
                } else {
                    System.out.println("Ошибка: число должно быть положительным. Попробуйте снова.");
                }
            } else {
                System.out.println("Ошибка: введите корректное целое число. Попробуйте снова.");
                scanner.next();
            }
        }
        return number;
    }

    public int checkNumberInRange(String prompt, int min, int max) {    // проверка чисел в диапазоне
        int number;
        while (true) {
            number = checkNumber(prompt);
            if (number >= min && number <= max) {
                break;
            } else {
                System.out.println("Ошибка: введите число в диапазоне от " + min + " до " + max + ".");
            }
        }
        return number;
    }

    public int[] checkArray(String prompt) {    // проверка что числа целые положительные в массиве
        int[] array = null;
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            String[] elements = input.split(" ");
            try {
                array = new int[elements.length];
                for (int i = 0; i < elements.length; i++) {
                    array[i] = Integer.parseInt(elements[i]);
                    if (array[i] < 0) {
                        throw new IllegalArgumentException("Ошибка: все числа должны быть положительными.");
                    }
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите только целые числа.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return array;
    }

    public void checkArrayForNegative(int[] arr) {  // только что положительные
        for (int num : arr) {
            if (num < 0) {
                throw new IllegalArgumentException("Ошибка: массив содержит отрицательное число.");
            }
        }
    }

    public int[] checkArrayWithNegative(String prompt) { // проверка каждого элемента (допуск отриц чисел)
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];
            boolean validInput = true;
            for (int i = 0; i < inputs.length; i++) {
                try {
                    arr[i] = Integer.parseInt(inputs[i]);
                } catch (NumberFormatException e) {
                    validInput = false;
                    break;
                }
            }
            if (validInput) {
                return arr;
            } else {
                System.out.println("Ошибка: введите корректные целые числа, разделенные пробелами.");
            }
        }

    }

}

class Methods {  // Задание 1. Методы

    // Задача № 2. Сумма знаков
    public int sumLastNums(int x) {
        int lastDigit = Math.abs(x % 10);
        int secondLastDigit = Math.abs((x / 10) % 10);
        return lastDigit + secondLastDigit;
    }

    // Задача № 4. Есть ли позитив
    public boolean isPositive(int x) {
        return x > 0;
    }

    // Задача № 6. Большая буква
    public boolean isUpperCase(char x) {
        return (x >= 'A' && x <= 'Z') || (x >= 'А' && x <= 'Я');
    }

    // Задача № 8. Делитель
    public boolean isDivisor(int a, int b) {
        return (a != 0 && b % a == 0) || (b != 0 && a % b == 0);
    }

    // Задача № 10. Многократный вызов
    public int lastNumSum(int a, int b) {
        int lastNumA = Math.abs(a % 10);
        int lastNumB = Math.abs(b % 10);
        return lastNumA + lastNumB;
    }


}

class Cycles {   // Задание 3. Циклы

    // Задача № 2. Числа наоборот
    public String reverseListNums(int x) {
        StringBuilder result = new StringBuilder(); // контейнер символов => не создаются новые строки на каждой итерации
        if (x >= 0) {
            for (int i = x; i >= 0; i--) {
                result.append(i).append(" ");
            }
        }
        else {
            for (int i = x; i <= 0; i++) {
                result.append(i).append(" ");
            }
        }
        return result.toString().trim(); // убираем последний лишний пробел
    }

    // Задача № 4. Степень числа.
    public double pow(int x, int y) {
        double result = 1;
        int absY = Math.abs(y);
        for (int i = 0; i < absY; i++) {
            result *= x;  // умножаем результат на x absY раз
        }
        if (y < 0) {
            result = 1 / result;
        }
        return result;
    }

    // Задача № 6. Одинаковость
    public boolean equalNum(int x) {
        x = Math.abs(x);  // игноририруем знак
        int lastDigit = x % 10;
        x /= 10;
        while (x > 0) {
            int currentDigit = x % 10;
            if (currentDigit != lastDigit) {
                return false;
            }
            x /= 10;
        }
        return true;
    }

    // Задача № 8. Левый треугольник.
    public void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Задача № 10. Угадайка
    public int guessGame(int userGuess, int targetNumber, int attempts) {
        attempts++;
        if (userGuess == targetNumber) {
            System.out.println("Вы угадали! Число было " + targetNumber + ". Вы отгадали число за " + attempts + " попыток.");
            return attempts;
        } else {
            System.out.println("Вы не угадали, попробуйте еще раз.");
            return -1;
        }
    }



}

class Conditions {   // Задание 2. Условия

    // Задача № 2. Безопасное деление
    public double safeDiv(int x, int y) {
        if (y == 0) {
            return 0; // Возвращаем 0, если деление на ноль
        }
        return (double) x / y; // Иначе выполняем деление
    }

    // Задача № 4. Строка сравнения.
    public String makeDecision(int x, int y) {
        String result;
        if (x > y) {
            result = x + " > " + y;
        } else if (x < y) {
            result = x + " < " + y;
        } else {
            result = x + " == " + y;
        }
        return result;
    }

    // Задача № 6. Тройная сумма
    public boolean sum3(int x, int y, int z) {
        if (x + y == z || x + z == y || y + z == x) {
            return true;
        } else {
            return false;
        }
    }

    // Задача № 8.Возраст
    public String age(int x) {
        if (x % 10 == 1 && x % 100 != 11) {
            return x + " год";
        } else if ((x % 10 == 2 || x % 10 == 3 || x % 10 == 4) && (x % 100 != 12 && x % 100 != 13 && x % 100 != 14)) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    // Задача № 10. Вызов дней недели
    public void printDays(String x) {
        x = x.toLowerCase();    // приводим строку к нижнему регистру для корректного сравнения
        switch (x) {
            case "понедельник":
                System.out.println("Понедельник");
            case "вторник":
                System.out.println("Вторник");
            case "среда":
                System.out.println("Среда");
            case "четверг":
                System.out.println("Четверг");
            case "пятница":
                System.out.println("Пятница");
            case "суббота":
                System.out.println("Суббота");
            case "воскресенье":
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Это не день недели");
        }
    }


}

class Arrays {   // Задание 4. Массивы

    // Задача № 2. Поиск последнего значения.
    public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Задача № 4. Добавление в массив.
    public int[] add(int[] arr, int x, int pos) {
        if (pos < 0 || pos > arr.length) {
            throw new IllegalArgumentException("Ошибка: Позиция за пределами массива.");
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == pos) {
                newArr[i] = x;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }
        return newArr;
    }

    // Задача № 6. Реверс
    public void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Задача № 8. Объединение
    public int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        return result;
    }

    // Задача № 10. Удалить негатив.
    public int[] deleteNegative(int[] arr) {
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        for (int num : arr) {
            if (num >= 0) {
                positiveNumbers.add(num);
            }
        }
        return positiveNumbers.stream().mapToInt(i -> i).toArray();
    }


}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CheckInput validator = new CheckInput(); // все проверки

        Methods methods = new Methods(); // Задание 1. Методы

        // Задача № 2. Сумма знаков
//        int x = validator.checkNumberWithTwoDigits("Введите число с минимум двумя цифрами: ");
//        int result = methods.sumLastNums(x);
//        System.out.println("Сумма двух последних цифр: " + result);

        // Задача № 4. Есть ли позитив
        int x = validator.checkNumber("Введите целое число: ");
        boolean result = methods.isPositive(x);
        System.out.println("Число " + x + " положительное? : " + result);

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
//        int[] arr = validator.checkArray("Введите массив положительных чисел через пробел: ");
//        arrays.reverse(arr);
//        System.out.println("Массив после реверса: " + java.util.Arrays.toString(arr));

        // Задача № 8. Объединение
//        int[] arr1 = validator.checkArray("Введите элементы первого массива, разделенные пробелами: ");
//        int[] arr2 = validator.checkArray("Введите элементы второго массива, разделенные пробелами: ");
//        int[] result = arrays.concat(arr1, arr2);
//        System.out.println("Результат объединения массивов: ");
//        for (int num : result) {
//            System.out.print(num + " ");
//        }

        // Задача № 10. Удалить негатив.
//        int[] arr = validator.checkArrayWithNegative("Введите массив целых чисел, разделенный пробелами: ");
//        int[] result = arrays.deleteNegative(arr);
//        System.out.print("Массив после удаления отрицательных чисел: ");
//        System.out.println(java.util.Arrays.toString(result));

    }
}