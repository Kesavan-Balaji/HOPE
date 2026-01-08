import java.util.*;

public class BinarytoDec {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int div=1;
        while(num!=0){
            if(num%div==0){
                div*=2;
            }
            else{
                div/=2;
                System.out.print(div+" ");
                num-=div;
                div=1;
            }
        }
    }

}
