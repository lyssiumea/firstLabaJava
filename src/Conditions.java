public class Conditions {   // Задание 2. Условия

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




}
