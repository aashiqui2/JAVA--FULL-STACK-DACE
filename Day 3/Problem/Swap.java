
public class Swap {
    public static void main(String[] args) {
        int a = 20, b = 30;
        System.out.println(a + " " + b);
        // with third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);

        //without third variable
        a=a+b;//50
        b=a-b;//20
        a=a-b;//30
    }
}
