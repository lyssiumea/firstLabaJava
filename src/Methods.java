public class Methods {  // Задание 1. Методы

    // Задача № 2. Сумма знаков
    public int sumLastNums(int x) {
        int lastDigit = Math.abs(x % 10);
        int secondLastDigit = Math.abs((x / 10) % 10);
        return lastDigit + secondLastDigit;
    }

}
