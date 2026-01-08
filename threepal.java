import java.util.*;
public class threepal {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int adder=s.length()-2;
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=0;
        for(int ch: map.values()){
            count+=(adder*(ch-1));

        }
        System.out.println(count);

    }
}
