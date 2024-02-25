import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class twoKnight {
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
        int n = s.nextInt();
        solve(n);
    }

    public static void solve(int n) {

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println(0);
            } else if (i == 2) {
                System.out.println(6);
            } else {
                long ans = i * i;
                ans = ans * (ans - 1);
                ans = ans / 2;// total number of combinations
                // now finding total number of combinations wheere we can't put the two knights
                long cant = (i - 2) * (i - 1);
                System.out.println(ans - 4 * cant);

            }
        }
    }
}
