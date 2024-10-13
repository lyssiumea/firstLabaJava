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
