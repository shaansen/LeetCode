
public class SimilarRGBColor {
	
	static public int[] getPossibleValues() {
		int[] result = new int[16];
		for (int i = 0; i < 16; i++) {
			result[i] = 17*i;
		}
		return result;
	}
	
	static public String getClosestHex(String s, int[] arr) {
		int x = Integer.parseInt(s,16);
		int min = Integer.MAX_VALUE;
		String minString = "";
		for (int i = 0; i < arr.length; i++) {
			if(Math.abs(x-arr[i]) < min) {
				min = Math.abs(x-arr[i]);
				minString = Integer.toHexString(arr[i]);
			}
		}
		return minString.equals("0") ? "00" : minString;
	}
	
	static public String similarRGB(String color) {
		color = color.substring(1);
		int[] mapping = getPossibleValues();
		StringBuilder sb = new StringBuilder();
		sb.append("#");
        for (int i = 0; i < color.length(); i+=2) {
			sb.append(getClosestHex(color.substring(i,i+2),mapping));	
		}
        return sb.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(similarRGB("#1c9e03"));
	}

}
