public class Methods {  // Задание 1. Методы

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


}
