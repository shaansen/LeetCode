import java.util.LinkedList;

public class AllCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3};
		
		int n = (int)Math.pow(2,nums.length);
		LinkedList<Integer> list = new LinkedList();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < nums.length; j++) {
				if((i & (1 << j)) > 0) {
					System.out.println("i:"+i+"\tj:"+j);
					System.out.println("Binary String:"+Integer.toBinaryString(i));
					System.out.println(Integer.toBinaryString((1 << j)));
					System.out.println("Answer:"+(i & (1 << j)));
					System.out.println("=====================================");
				}
			}
			System.out.println();
		}
	}
}
