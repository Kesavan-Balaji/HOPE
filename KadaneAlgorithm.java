import java.util.*;
public class KadaneAlgorithm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0]>0?arr[0]:0;
        int sum=0;
        for(int a:arr){
            sum+=a;
            if(sum<0){
                sum=0;
            }
            max=Math.max(max,sum);
        }
        System.out.print(max);
        sc.close();
    }
}
