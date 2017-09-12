import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        int[] arrayNumbers;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        arrayNumbers = new int[in.nextInt()];

        for (int i = 0; i < arrayNumbers.length; i++){
            System.out.println("Введите " + (i + 1) + " елемент:");
            if (in.hasNextInt()){
                arrayNumbers[i] = in.nextInt();
            }else {
                System.out.println("Вы ввели не число!");
                break;
            }
        }

        //Call methods
        //searchMinValue(arrayNumbers);
        //searchMaxValue(arrayNumbers);
        //searchRepetitions(arrayNumbers, 5);
        //insertionSort(arrayNumbers);

    }

    public static void searchMinValue(int[] arrayNumbers){
        int min = Integer.MAX_VALUE;
        for (int value : arrayNumbers) {
            min = Math.min(min, value);
        }
        System.out.println("Минимальный елемент в массиве = " + min);

    }

    public static void searchMaxValue(int[] arrayNumbers){
        int max = Integer.MIN_VALUE;
        for (int value : arrayNumbers) {
            max = Math.max(max, value);
        }
        System.out.println("Максимальный елемент в массиве = " + max);

    }

    public static void searchRepetitions(int[] arrayNumbers, int n) {
        int repeat = 0;
        for (int i : arrayNumbers){
            if (i == n){
                repeat++;
            }
        }
        System.out.println("Количество повторений числа " + n + " равно = " + repeat);

    }

    public static void insertionSort(int[] arrayNumbers) {
        int temp;
        int j;
        System.out.println("Исходный массив:");
        for (int i : arrayNumbers) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 1; i < arrayNumbers.length; i++){
            temp = arrayNumbers[i];
            for(j = i - 1; j >= 0 && temp < arrayNumbers[j]; j--){
                arrayNumbers[j+1] = arrayNumbers[j];
            }
            arrayNumbers[j+1] = temp;
        }

        System.out.println("Упорядоченный масив:");
        for (int i : arrayNumbers) {
            System.out.print(i + " ");
        }

    }

}
