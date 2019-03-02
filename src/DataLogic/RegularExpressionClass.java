package DataLogic;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionClass {
	  //private static final String REGEX = "\\bcat\\b";
	   //private static final String INPUT = "cat cat cat cattie cat";
	   public static boolean cheackString(String text, String regex) {
		  Pattern p = Pattern.compile(regex);
		  Matcher m = p.matcher(text);
		  if(m.find()) {
			  return true;
		  }else {
			  return false;
		  }
	   }

}