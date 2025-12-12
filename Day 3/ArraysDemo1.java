import java.util.Arrays;
import java.util.Scanner;
public class ArraysDemo1 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        Scanner sc = new Scanner(System.in);
        // arr[0]=sc.nextInt();
        // arr[1]=sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }
}
