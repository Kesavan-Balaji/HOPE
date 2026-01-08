import java.util.*;
public class Pro3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int r = sc.nextInt();
        System.out.println("Enter no. of columns");
        int c = sc.nextInt();
        System.out.println("Enter elements");
        int[][] arr = new int[r][c];
        int[][] ans = new int[r][c];
        int colmax = 0;
        int sum = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
                if(i==0){
                    ans[i][j] = arr[i][j];
                }
            }
        }
        for(int i=1;i<r;i++){
            for(int j=0;j<c;j++){
                int max = Integer.MIN_VALUE;
                for(int k=0;k<c;k++){
                    if(k!=j){
                        max=Math.max(max,ans[i-1][k]);
                    }
                }
                ans[i][j]=arr[i][j]+max;
            }
        }
        int res = Integer.MIN_VALUE;
        for(int j=0;j<c;j++){
            res = Math.max(res,ans[r-1][j]);
        }
        System.out.println(res);
    }
}