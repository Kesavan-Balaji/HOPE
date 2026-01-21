import java.util.*;

public class ReverseOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> oddIndex=new ArrayList<>();
        for(int i=0;i<n;i++){
            if((arr[i]&1)==1){
                oddIndex.add(i);
            }
        }
        int left=0,right=oddIndex.size()-1;
        while(left<right){
            int temp=arr[oddIndex.get(left)];
            arr[oddIndex.get(left)]=arr[oddIndex.get(right)];
            arr[oddIndex.get(right)]=temp;
            left++;
            right--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
 
