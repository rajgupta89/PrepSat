import java.util.*;
public class circular_array {
    public static int xorsum(int n, int[] a){
        int[] b=new int[n*2];
        int sum=0;
        if(n<3){
            for (int i = 0; i < n; i++) {
                a[i]=0;
            }
        }
        else{
        for (int i = 0; i < n; i++) {
            b[i]=b[n+i]=a[i];
        }
        for (int i = 0; i < n; i++) {
            a[i]=Math.abs(b[i+1]-b[i+2]);
        }
    }
        int m=(int)(Math.pow(10, 9)+7);
        for (int i = 0; i < n; i++) {
            sum=sum+((a[i]^i)%m);
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