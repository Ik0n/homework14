import java.util.ArrayList;

/**
 * Класс 1 задания
 */
public class Sample01 {
    /**
     * Точка входа в программу
     * @param args
     */
    public static void main(String[] args) {
        int[] array01 = {4,1,1,1,1,1,1,1,1,1};
        int[] array02 = {5,1,2,3,1,4,7,1,1,1};

        printArray(method01(array01));
        printArray(method01(array02));

    }

    /**
     * Метод создающий массив из чисел которые идут после 4 в массиве параметре
     * @param array массив
     * @return возвращаем новый массив
     */
    public static int[] method01(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[] result;
        int flag = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                flag = i + 1;
                break;
            }
        }

        if (flag == 0)
            //throw new RuntimeException("В массиве должна быть хотя бы 1 четвёрка");
            System.out.println();

        for (int i = flag - 1; i < array.length; i++) {
            arrayList.add(array[i]);
        }

        result = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            result[i] = arrayList.get(i);
        }


        return result;
    }

    /**
     * Метод распечатывающий массив
     * @param array массив
     */
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " | ");
        System.out.println();
    }

}
