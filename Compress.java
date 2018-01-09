import java.util.Arrays;

public class Compress {
	
	public static int compress(char[] chars) {
		
		if(chars.length==1) {
			return 1;
		}
		
        int count = 1;
        int index = 0;
        
        for(int i=1;i<chars.length;i++) {
        	if(chars[i-1]!=chars[i]) {
                chars[index++] = chars[i-1]; 
                if(count!=1) {
                    char[] countArr = Integer.toString(count).toCharArray();
                    for(int j=0;j<countArr.length;j++) {
                        chars[index++] = countArr[j];
                    }
                }
                count = 1;
            } else {
                count++;
            }
        }
        chars[index++] = chars[chars.length-1]; 
        if(count!=1) {
            char[] countArr = Integer.toString(count).toCharArray();
            for(int j=0;j<countArr.length;j++) {
                chars[index++] = countArr[j];
            }
        }
        System.out.println(Arrays.toString(chars));
        return index;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] chars = {'a'};
		System.out.println(compress(chars));
	}

}
