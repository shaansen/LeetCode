import java.util.*;
import java.io.*;

public class ArrayBasics {
	
	// Arrays DS
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		String[] s = br.readLine().split(" ");
//		for (int i = s.length-1; i >= 0; i--) {
//			System.out.print(s[i]+" ");
//		}
//
//	}
	
	// 2D Array DS
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		int[][] a = new int[6][6];
//		int max = Integer.MIN_VALUE;
//		for (int i = 0; i < 6; i++) {
//			for (int j = 0; j < 6; j++) {
//				a[i][j] = sc.nextInt();
//			}
//		}
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 4; j++) {
//				int sum = a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
//				max = Math.max(sum,max);
//			}
//		}
//		
//		System.out.println(max);
//	}

	// Dynamic Array
	
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[6][6];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				a[i][j] = sc.nextInt();
			}
		}
	}

}
