public class Conditions {   // Задание 2. Условия

    // Задача № 2. Безопасное деление
    public double safeDiv(int x, int y) {
        if (y == 0) {
            return 0; // Возвращаем 0, если деление на ноль
        }
        return (double) x / y; // Иначе выполняем деление
    }


}
