import java.util.ArrayList;

public class Arrays {   // Задание 4. Массивы

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
