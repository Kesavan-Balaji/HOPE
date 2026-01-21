import java.util.*;
public class StringMod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int st=sc.nextInt();
        for(int i=st-1;i<(st-1+s.length());i++){
            System.out.print(s.charAt(i%s.length()));
        }
    }
}
// input : lemon (in next line) 3 output : monle (start from 3rd position print string in rotated manner)