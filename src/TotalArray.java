
import java.util.Arrays;
import java.util.Scanner;

public class TotalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] Array1 = new int[5];
        for (int i = 0; i < Array1.length; i++){
            System.out.println(Array1[i] = input.nextInt());
        }
        for (int item : Array1) {
            System.out.print(item + "\t");
        }
        System.out.println("----------------");

        int[] Array2 = new int[6];
        for (int i = 0; i < Array2.length; i++){
            System.out.println(Array2[i] = input.nextInt());
        }
        int b = input.nextInt();
        for (int value : Array2) {
            System.out.print(value + "\t");
        }
        int[] Array3 = new int[Array1.length + Array2.length];
        for (int l = 0; l < Array3.length; l++) {
            if (l < Array1.length)
                Array3[l] = Array1[l];
            else
                Array3[l] = Array2[l - Array1.length];
        }
        System.out.println(Arrays.toString(Array3));
    }
}
