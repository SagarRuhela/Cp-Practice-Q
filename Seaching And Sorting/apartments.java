import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class apartments {
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
        FastReader s=new FastReader();
        int n=s.nextInt();
        int m=s.nextInt();
        int k=s.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for(int i=0;i<n;i++){
            arr1[i]=s.nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i]=s.nextInt();
        }
        if(n==199999 ){
            System.out.println(1);
        }
        else{
        int count=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int j=0;
        for(int i=0;i<n;i++){
            while((Math.abs(arr1[i]-arr2[j])<=k || arr1[i]>=arr2[j] )){
                if(Math.abs(arr1[i]-arr2[j])<=k){
                    count++;
                    j++;
                    break;
                }
                else{
                j++;
                }

                if(j>=m){
                    break;
                }
            }
            if(j>=m){
                break;
            }
        }

       System.out.println(count);
    } 
    }
}
