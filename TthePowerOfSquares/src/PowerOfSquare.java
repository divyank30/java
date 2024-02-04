import java.util.Scanner;

public class PowerOfSquare {
 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Enter a number");
	 int num=scan.nextInt();
	 System.out.println(squareNumber(num));
	 
	 scan.close();
}

 public static int squareNumber(int num)
 {
	 return num*num;
 }
}
