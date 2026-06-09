import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            HashMap<Long, Long> map = new HashMap<>();
            long ans = 0;

            for (int i = 1; i <= n; i++) {
                long a = sc.nextLong();

                long key = a - i;

                ans += map.getOrDefault(key, 0L);

                map.put(key, map.getOrDefault(key, 0L) + 1);
            }

            System.out.println(ans);
        }
        sc.close();
    }
}





        