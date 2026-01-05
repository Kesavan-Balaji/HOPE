import java.util.*;
public class CombinationsTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int room[]=new int[r];
        for(int i=0;i<r;i++){
            room[i]=sc.nextInt();
        }   
        int ways=0;
        for(int i=1;i<=(1<<r)-1;i++){
            int cap=0;
            for(int sh=0;sh<r;sh++){
                if((i&(1<<sh))>0){
                    cap+=room[sh];
                }
            }
            if(cap==n){
                ways++;
            }
        }
        System.out.println(ways);
        sc.close();
    }
}
