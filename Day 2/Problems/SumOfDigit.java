public class SumOfDigit {
    public static void main(String[] args){
        int n=234;
        int sum=0;
        /* while(n!=0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        } */
       for(int i=n;i!=0;i=i/10){
         int rem=i%10;
        sum=sum+rem;
       }
        System.out.println(sum);  
    }
}
