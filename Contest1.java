import java.util.*;
public class Contest1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            String s=sc.nextLine();
            if(s.length()<=10){
                System.out.println(s);
            }
            else{
                System.out.println(s.charAt(0)+""+(s.length()-2)+""+s.charAt(s.length()-1));
            }
            n--;
        }
        sc.close();
    }
}
