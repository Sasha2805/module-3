import java.util.Scanner;

public class SearchRepetitions {

    public static void main(String[] args) {
        int[] arrayNumbers;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        arrayNumbers = new int[in.nextInt()];

        //Call methods
        arrayFilling(arrayNumbers, in);
        maxRepeat(arrayNumbers);
        minRepeat(arrayNumbers);

    }

    public static void arrayFilling(int[] arrayNumbers, Scanner in) {
        for (int i = 0; i < arrayNumbers.length; i++){
            System.out.println("Введите " + (i + 1) + " елемент:");
            if (in.hasNextInt()){
                arrayNumbers[i] = in.nextInt();
            }else {
                System.out.println("Вы ввели не число!");
                break;
            }
        }

    }

    public static void maxRepeat(int[] arrayNumbers) {
        int count = 0;
        int temp;
        for (int value : arrayNumbers) {
            temp = repetitions(arrayNumbers, value);
            if (count < temp){
                count = temp;
            }
        }

        if (count == 1){
            System.out.println("Повторений нет");
        }else {
            System.out.println("Максимальное количество повторений: " + count);
        }

    }

    public static void minRepeat(int[] arrayNumbers) {
        int count = Integer.MAX_VALUE;
        int temp;
        for (int value : arrayNumbers) {
            temp = repetitions(arrayNumbers, value);
            if (temp < count && temp != 1){
                count = temp;
            }
        }

        if (count == Integer.MAX_VALUE){
            System.out.println("Повторений нет");
        }else {
            System.out.println("Минимальное количество повторений: " + count);
        }

    }

    public static int repetitions(int[] arrayNumbers, int value) {
        int temp = 0;
        for (int i : arrayNumbers) {
            if (i == value){
                temp++;
            }
        }
        return temp;

    }

}
