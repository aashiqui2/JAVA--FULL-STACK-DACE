public class Fibanocci {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int n = 6; 
        System.out.print(a + " " + b+" ");
        for (int i = 1; i <= n; i++) {
            int c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }

    }
}
