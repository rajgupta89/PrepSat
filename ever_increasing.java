import java.util.*;
class ever_increasing {
    public static int ever(int n,int[] a ){
        int inc=1;
        int dec=1;
        int maxx=1;
        for (int i = 1; i < n; i++) {
            if(a[i]>a[i-1]){
              inc++;
              dec=1;
            }
            else if(a[i]<a[i-1]){
                dec++;
                inc=1;
            }
            else{
                inc=1;
                dec=1;
            }
            maxx=Math.max(maxx, Math.max(inc, dec));
        }
        return maxx;
    }
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt();
       int[] a=new int[n];
       for (int i = 0; i < n; i++) {
           a[i]=in.nextInt();
       }
       System.out.println(ever(n, a));
    }
}
