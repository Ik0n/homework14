/**
 * Второе задание
 */
public class Sample02 {
    /**
     * Точка входа в программу
     * @param args
     */
    public static void main(String[] args) {

        int[] array01 = {1,1,1,4,4,1,4,4};
        int[] array02 = {1,1,1,1,1,1};
        int[] array03 = {4,4,4,4};
        int[] array04 = {1,4,4,1,1,4,3};

        System.out.println(method01(array01));
        System.out.println(method01(array02));
        System.out.println(method01(array03));
        System.out.println(method01(array04));


    }

    /**
     * Метод вычисляющий есть ли в массиве хотябы одна 1 и 4
     * @param array массив
     * @return истина/ложь
     */
    public static boolean method01(int[] array) {
        boolean hasOne = false;
        boolean hasFour = false;

        for (int i = 0; i < array.length; i++) {

            if (isOne(array[i]))
                hasOne = true;

            if (isFour(array[i]))
                hasFour = true;

        }

        return hasOne && hasFour;
    }

    /**
     * Метод проверяющий являеться ли число единицой
     * @param number число
     * @return истина/ложь
     */
    public static boolean isOne(int number) {
        return number == 1;
    }
    /**
     * Метод проверяющий являеться ли число четвёркой
     * @param number число
     * @return истина/ложь
     */
    public static boolean isFour(int number) {
        return number == 4;
    }

}
