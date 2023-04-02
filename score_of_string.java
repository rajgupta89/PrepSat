import java.util.*;
class score_of_string{
    // public static String palin(String s){
    //     String s1="";
    //     for (int i = 0; i < s.length(); i++) {
    //         s1=s.charAt(i)+s1;
    //     }
    //     return s1;
    // }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int score=0;
        for(int i=0;i<s.length();i++){
            String s1="";
            for (int j = i; j < s.length(); j++) {
                s1+=s.charAt(j);
            }
            // if(s1.equals(palin(s1))){
            StringBuilder sb=new StringBuilder(s1);
            if(s1.equals(sb.toString())){
                 if(s1.length()==4)
                  score+=5;
                if(s1.length()==5)
                score+=10;
            }
        }
        System.out.println(score);
    }
}