import java.util.*;
public class PrefixSumMat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        sc.nextLine();
        int sr=sc.nextInt(),scol=sc.nextInt(),er=sc.nextInt(),ecol=sc.nextInt();
        sc.nextLine();

        int [][]mat=new int[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int [][] row=new int[R][C];

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(j==0){
                    row[i][j]=mat[i][j];
                }
                else{
                    row[i][j]=mat[i][j]+row[i][j-1];
                }
            }
        }

        int [][]col=new int[R][C];

        for(int j=0;j<C;j++){
            for(int i=0;i<R;i++){
                if(i==0){
                    col[i][j]=mat[i][j];
                }
                else{
                    col[i][j]=mat[i][j]+col[i-1][j];
                }
            }
        }

        int pre[][]=new int[R][C];
//        for (int i=0;i<R;i++){
//            for(int j=0;j<C;j++){
//                System.out.print(row[i][j]+" ");
//            }
//            System.out.println();
//        }

//        for(int i=0;i<R;i++){
//            for(int j=0;j<C;j++){
//                System.out.print(col[i][j]+" ");
//            }
//            System.out.println();
//        }

        for(int j=0;j<C;j++){
            for(int i=0;i<R;i++){
                if(i==0){
                    pre[i][j]=row[i][j];
                }
                else{
                    pre[i][j]=row[i][j]+pre[i-1][j];
                }
            }
        }

        int sum=pre[er-1][ecol-1];
        sum-=pre[sr-1][ecol-1];
        sum-=pre[er-1][scol-1];
        sum+=pre[sr-1][scol-1];

        System.out.println(sum);

//        for(int i=0;i<R;i++){
//            for(int j=0;j<C;j++){
//                if(i==0){
//                    System.out.print(mat[i][j]+" ");
//                    continue;
//                }
//                if(i!=0 && j==0){
//                    System.out.print(mat[i][j]+" ");
//                    continue;
//                }
//                pre[i][j]=row[i][j]+col[i][j];
//                System.out.print(pre[i][j]+" ");
//            }
//            System.out.println();
//        }


    }
}
    