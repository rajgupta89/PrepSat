import java.util.Scanner;

public class life_on_mars {
    public static int life(int n,int k, String[] a){
        int num=n;
       while(true){
         String s=Integer.toString(num);
         boolean b=true;
         for (int i = 0; i < k; i++) {
             if(s.contains(a[i])){
                b=false;
                break;
             }
         }
         if(b==false)
           num++;
         else
           return num;
       }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        String[] a=new String[n];
        for (int i = 0; i < k; i++) {
            a[i]=in.next();
        }
        System.out.println(life(n, k, a));
    }
}
