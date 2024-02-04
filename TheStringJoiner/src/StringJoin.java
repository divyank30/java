
public class StringJoin {
public static void main(String[] args) {
	String res=joinStrings("Hello, ", "World!");
	System.out.printf("%s",res);
	
}
public static String joinStrings(String str1, String str2)
{
	return str1+str2;
}
}
