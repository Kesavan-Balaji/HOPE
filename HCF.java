import java.util.*;
class HCF{

    public static long hcf(long a,long b){
        return b==0?a:hcf(b,a%b);
    }

    public static void solve(String s){
        int hash[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hash[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(hash[i]==0){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    } 

    public static void solve1(String s){
        int flag=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            flag=flag|(1<<(ch-'a'));
        }
        System.out.println(flag==(1<<26)-1?"Yes":"No");
    }

    public static void solve3(int n,int i){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        solve3(n,i+1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       // long a=sc.nextInt();
       // long b=sc.nextInt();
        //System.out.println(hcf(a,b));
      //  System.out.println((1<<26)-1);
      //  String s=sc.nextLine();
      //  solve1(s);
      int n=sc.nextInt();
      solve3(n,1);
        sc.close();
    }
}