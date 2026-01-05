import java.util.*;
public class LongestSubstringTwo {

    public static boolean isV(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int counter=0;
        int max=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<s.length();i++){
            counter+=isV(s.charAt(i))?1:-1;
            if(hm.containsKey(counter)){
                max=Math.max(max,i-hm.get(counter));
            }
            else{
                hm.put(counter,i);
            }
        }
        System.out.print(max);
        sc.close();
    }
}
