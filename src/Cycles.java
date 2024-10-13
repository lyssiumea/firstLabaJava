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

}
