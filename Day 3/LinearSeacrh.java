public class LinearSeacrh {
    public static void main(String[] args) {
        int a[]={23,12,45,67,89};
        int k=89;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                System.out.println("found");
            }
        }
    }
}
//! Time Complexity: O(n)
