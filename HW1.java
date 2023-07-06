public class HW1 {
    public static void main(String[] args) {
        String[] strArray = { "first", null, "third" };
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        printStringArray(strArray);
        printValueByIndex(intArray, 10);
        division(20, 0);
    }

    public static void division(double firstNum, double secondNum) {
        if (secondNum == 0) {
            throw new ArithmeticException("Делить на ноль нельзя");
        }
        double result = firstNum / secondNum;
        System.out.printf("Результат деления %f на %f равен %f.\n", firstNum, secondNum, result);
    }

    public static void printValueByIndex(int[] array, int index) {
        if (index > array.length - 1) {
            throw new ArrayIndexOutOfBoundsException("Элемента с таким индексом не существует");
        } else {
            System.out.printf("Элемент с индексом %d равен %d.\n", index, array[index]);
        }
    }

    public static void printStringArray(String[] array) {
        for (String item : array) {
            if (item == null) {
                throw new NullPointerException("Есть пустой элемент");
            }
            System.out.println(item);
        }
    }
}