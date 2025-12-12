public class ArrayDemo3 {
    public static void main(String[] args) {
        int a[] = { 90, 23, 45, 67, 25 };
        int min = a[0];
        // iterate
        for (int i = 1; i < a.length; i++) {
            if (a[i]< min) { //to find max (a[i]>max )
                min = a[i];
            }
        }
        System.out.println(min);
    }
}
