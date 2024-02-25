
/**
 * numberSpiral
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class numberSpiral {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {
        FastReader s = new FastReader();
        int t = s.nextInt();
        while (t-- > 0) {
            long x = s.nextLong();
            x = x - 1;
            long y = s.nextLong();
            y = y - 1;
            long ans = solve(x, y);
            System.out.println(ans);

        }
    }

    public static long solve(long x, long y) {
        if (x == 0 && y == 0) {
            return 1;
        }
        long max = Math.max(x, y);
        long sn = max * (2 * 3 + (max - 1) * 2);
        sn = sn / 2;
        sn = sn + 1;

        long smallSn = sn - (3 + (max - 1) * 2);
        smallSn = smallSn + 1;

        if (x >= y) {
            if (x % 2 == 0) {
                return smallSn + y;
            } else {
                return sn - y;
            }

        } else {
            if (y % 2 == 0) {
                return sn - x;
            } else {
                return smallSn + x;
            }
        }

    }
}