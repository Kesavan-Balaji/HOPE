import java.util.*;
public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Integer,Integer> hm=new HashMap<>();
        int counter=0;
        int maxi=0;
        hm.put(0,-1);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                counter++;
            }
            else{
                counter--;
            }
            if(hm.containsKey(counter)){
             maxi=Math.max(maxi,i-hm.get(counter));
            }
            else{
                hm.put(counter,i);
            }

        }
        System.out.print(maxi);
        sc.close();
    }
}
