import java.util.Scanner;

public class MatrixAdjacentSum {

    public static void solve(int mat[][]){
        int rd[]={-1,-1,-1,0,0,1,1,1};
        int cd[]={-1,0,1,-1,1,-1,0,1};
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                int sum=0;
                for(int d=0;d<8;d++){
                    int r=i+rd[d];
                    int c=j+cd[d];
                    if(r>=0 && r<mat.length && c>=0 && c<mat[0].length){
                        sum+=mat[r][c];
                    }
                }
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        solve(mat);
        sc.close();
    }
}
