import java.util.ArrayList;
import java.util.Scanner;

public class ThirdTask {
    
    public static void main(String[] args) {
        ArrayList<Integer> arrayNumbers = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("Введите елементы массива(для завершения заполнения массива введите add):");
        for (int i = 0; in.hasNextInt(); i++){
            arrayNumbers.add(i, in.nextInt());
        }

        System.out.println("Ваш массив:");
        for (int value : arrayNumbers) {
            System.out.print(value + " ");
        }

        System.out.println();
        System.out.println("Размер массива  = " + arrayNumbers.size());

    }

}
