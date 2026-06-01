package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindMaximumInAnArray {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {

			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			int max = Integer.MIN_VALUE;
			for (int i = 0; i < n; i++) {
				int num = Integer.parseInt(st.nextToken());
				if (num > max) {
					max = num;
				}
			}
			System.out.println(max);
		}
	}
}
