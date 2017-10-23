import java.util.HashMap;
import java.util.Random;


public class EncodeandDecodeTinyURL {
	
	public static HashMap<String,String> map = new HashMap<String, String>();
	
	static public String getRandomString() {
		 String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        if(map.keySet().contains(saltStr)) {
        	return getRandomString();
        }
        return saltStr;
	}
	
	// Encodes a URL to a shortened URL.
    static public String encode(String longUrl) {
        String encoder = getRandomString();
        map.put(encoder, longUrl);
        return encoder;
    }

    // Decodes a shortened URL to its original URL.
    static public String decode(String shortUrl) {
        String decoder = map.get(shortUrl);
        return decoder;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
