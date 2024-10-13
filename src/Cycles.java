public class Cycles {   // Задание 3. Циклы

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



}
