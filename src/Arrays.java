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

    // Задача № 4. Добавление в массив.
    public int[] add(int[] arr, int x, int pos) {
        if (pos < 0 || pos > arr.length) {
            throw new IllegalArgumentException("Ошибка: Позиция за пределами массива.");
        }
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == pos) {
                newArr[i] = x;  // Вставка нового элемента
            } else {
                newArr[i] = arr[j];  // Копирование элементов исходного массива
                j++;
            }
        }
        return newArr;
    }
}
