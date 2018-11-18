package DataLogic;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
public class Hash{
	public static String hashString(String text) throws NoSuchAlgorithmException
	{
		byte[] hash = null;
		try 
		{
			MessageDigest ms = MessageDigest.getInstance("SHA-256");
			hash = ms.digest(text.getBytes());
		}catch (NoSuchAlgorithmException e){
				e.printStackTrace();
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<hash.length;++i)
		{
			String hex = Integer.toHexString(hash[i]);
			if(hex.length()==1){
				sb.append(0);
				sb.append(hex.charAt(hex.length()-1));
			}else{
				sb.append(hex.substring(hex.length()-2));
			}
		}
		return sb.toString();
	}
	
	public static String saltedHashString(String text,String salt)
	{
		try{
			return hashString(text+salt);
		}catch (NoSuchAlgorithmException e){
			return null;
		}
	}
	
	    static String characters="AaBCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz0123456789";
	    static Random rng = new Random();
	    static int length = 12;
	    public static String Salted()
	    {
	        char[] text = new char[length];
	        for (int i = 0; i < length; i++)
	        {
	            text[i] = characters.charAt(rng.nextInt(characters.length()));
	        }
	        return new String(text);
	    }
}