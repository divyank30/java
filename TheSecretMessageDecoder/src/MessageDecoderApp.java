import java.util.Scanner;

public class MessageDecoderApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Character");
	char input=scan.next().charAt(0);
	MessageDecoder decoder = new MessageDecoder(); 

	int res=decoder.decodeCharacter(input);
	System.out.println(res);
	scan.close();
}
}
