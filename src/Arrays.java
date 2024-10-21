public class Arrays {   // Задание 4. Массивы

    // Задача № 2. Поиск последнего значения.
    public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;  // Возвращаем индекс, если нашли точное совпадение с x
            }
        }
        return -1;
    }

}
