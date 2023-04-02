import java.util.*;
class missing_keyboard {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        int maxx=0;
        int minn=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            a[i]=in.nextInt();
            maxx=Math.max(maxx, a[i]);
            minn=Math.min(minn, a[i]);
        }
        int ans=(maxx-minn)-n+1;
        System.out.println(ans);
    }
}
