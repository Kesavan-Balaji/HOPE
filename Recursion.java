import java.util.*;
public class Recursion {

    public static void prt(int n){
        if(n==0){
            return;
        }
        prt(n-1);
        System.out.print(n+" ");
    }

    public static void prtr(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        prtr(n-1);
    }

    public static void bin(int n){
        if(n==0) return;
        bin(n/2);
        System.out.print(n%2);
    }

    public static void toHex(int n){
        if(n==0) return;
        String arr[]={"A","B","C","D","E","F"};
        toHex(n/16);
        System.out.print(n%16>9?arr[(n%16)%10]:n%16);
    }
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   
  
   // prtr(n);
   // System.out.println();
   // prt(n);
   // System.out.println();
   // prtr(n);
  // System.out.println();
    bin(n);
    System.out.println();
    toHex(n);
    sc.close();
 }   
}
