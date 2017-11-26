
public class canWinNim {
	
	static public boolean canWinNim(int n) {
        if(n==0 || (n>1 && n<=4)) {
            return false;
        } else if(n==1 || (n>4 && n<=7)) {
            return true;
        } else {
            return canWinNim(n%4);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 20; i++) {
			System.out.println(i+" -> "+canWinNim(i));
		}

	}

}
