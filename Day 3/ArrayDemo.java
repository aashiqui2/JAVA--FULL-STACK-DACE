import java.util.Arrays;
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 10 };
        int len = arr.length;
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);

        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
        for(int i=len-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }

        //foreach loop
        for(int value:arr){
            System.out.println(value);
        }

        System.out.println(arr);//[I@2f92e0f4

        System.out.println(Arrays.toString(arr));
    }
}
