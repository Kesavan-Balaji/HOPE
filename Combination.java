import java.util.*;
public class Combination {
    
    public static void solve(String s){
        int l=s.length();
        for(int i=1;i<=(1<<l)-1;i++){
            for(int sh=0;sh<l;sh++){
                if((i&(1<<sh))>0){
                    System.out.print(s.charAt(sh));
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        solve(s);
        sc.close();
    }
}
