import java.util.*;
public class palad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s;
        int even = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            s = sc.nextLine();
            int tot = 0;
            for (char ch : s.toCharArray()) {
                tot ^= (1 << (ch - 'a'));
            }
            if (tot == 0) even++;
            else {
                map.put(tot, map.getOrDefault(tot, 0) + 1);
            }
        }

            long ans = 0;
            ans += (long) even * (even - 1) / 2;
            int odd = n - even;
            ans += (long) even * odd;
            for (int num : map.keySet()) {
                for (int i = 0; i < 26; i++) {
                    int mask = num ^ (1 << i);
                    if(map.containsKey((mask))){
                        ans+=(long)map.get(num)*map.get(mask);
                    }
                }
            }
            ans/=2;
            System.out.println((ans));
        }
    }

