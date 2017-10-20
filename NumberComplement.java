
public class NumberComplement {
	
	static public int findComplement(int num) {
		if(num==0) {
			return 1;
		}
		int size = (int)(Math.log(num) / Math.log(2)) + 1;
		System.out.println(size);
		long answer = (long)Math.pow(2,size) - 1 - num;
		
		return (int) answer; 
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(2147483647+" - "+findComplement(2147483647));	
		
	}
}
