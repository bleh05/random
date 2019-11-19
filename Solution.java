import java.util.*;
import java.io.*;
public class Solution {
	public static void main(String[] args) throws Exception {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		int t = sc.nextInt();
		for(int cas = 1; cas <= t;cas++) {
			pw.printf("Case #%d: %d\n",cas, 0);
		}
		pw.close();
	}
}
@SuppressWarnings("all")
class FastScanner {
    BufferedReader br;
    StringTokenizer st;
    public FastScanner(BufferedReader d) {
        br=d;
    }
    public FastScanner(String s) {
        try {
            br = new BufferedReader(new FileReader(s));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public FastScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    } 
    String nextToken() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    int nextInt() {
        return Integer.parseInt(nextToken());
    } 
    long nextLong() {
        return Long.parseLong(nextToken());
    }
    double nextDouble() {
        return Double.parseDouble(nextToken());
    }
}
