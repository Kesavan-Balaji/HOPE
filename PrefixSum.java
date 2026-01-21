import java.util.*;
public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int left=sc.nextInt();
        int right=sc.nextInt();
        sc.nextLine();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int []pre=new int[n+1];
        pre[0]=0;
        for(int i=1;i<n+1;i++){
            pre[i]=arr[i-1]+pre[i-1];
        }
        for(int ele:pre) {
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println(pre[right]-pre[left-1]);

    }
}
