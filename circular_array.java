import java.util.*;
class circular_array {
    public static int xorsum(int n, int[] a){
        int[] b=new int[n];
        int temp=a[0];
        for (int i = 0; i < n-1; i++) {
            a[i]=Math.abs(a[i+1]-a[i]);
        }
        a[n-1]=Math.abs(temp-a[n-1]);
        int sum=0;
        int m=(int)(Math.pow(10, 9)+7);
        for (int i = 0; i < n; i++) {
            b[i]=a[i];
            sum=sum+((b[i]^i)%m);
        }
        return sum;
    }
   public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] a=new int[n];
       for (int i = 0; i < n; i++) {
           a[i]=in.nextInt();
       }
       System.out.println(xorsum(n, a));
   }    
}