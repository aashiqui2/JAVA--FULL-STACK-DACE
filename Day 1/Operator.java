public class Operator {
    public static void main(String[] args) {
        // 1.ARITHEMETIC
        int a = 10, b = 3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // 2.Assignment Operator
        int x = 10;
        x += 5;
        x *= 2;
        System.out.println(x);

        // 3.Relational Operators
        int c = 10, d = 20;
        System.out.println(c < d);
        System.out.println(c == d);

        // 4.Logical Operator
        int age = 22;
        System.out.println(age > 18 && age < 60);
        System.out.println(age < 18 || age > 60);
        System.out.println(!(age > 18));

        // 5.Unary Operators
        int e = 5;
        System.out.println(++e);
        System.out.println(e++);
        System.out.println(e);

        // 6.Bitwise Operator
        int t = 5; // 0101
        int s = 3; // 0011
        int u=~3;

        System.out.println(t & s); 
        System.out.println(t | s); 
        System.out.println(t ^ s); 
        System.out.println(u);
        System.out.println(t << 1); 
        System.out.println(t>>1);

    }
}
