import java.util.*;
public class stringpal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int tot = 0;
        for (char ch : s.toCharArray()) {
            tot ^= (1<< (ch - 'a'));
        }
        System.out.print((tot == 0 || ((tot & (tot - 1)) == 0)));
    }
}