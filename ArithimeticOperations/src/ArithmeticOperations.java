import java.util.Scanner;

public class ArithmeticOperations {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter two Number");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	int res1=subtractNumbers(num1,num2);
	System.out.println("Substraction is "+res1);
	System.out.println("Enter two Number");
	num1=scan.nextInt();
	num2=scan.nextInt();
	int res2= multiplyNumbers(num1,num2);
	System.out.println("Multplication is "+res2);
	System.out.println("Enter two Number");
	double numreal1=scan.nextDouble();
	double numreal2=scan.nextDouble();
	double res3=divideNumbers(numreal1,numreal2);
	System.out.println("Division is "+res3);
	System.out.println("Enter two Number");
	num1=scan.nextInt();
	num2=scan.nextInt();
	int res4=findRemainder(num1,num2);
	System.out.println("Reminder is "+res4);	
	
}// This is the closing of the main

public static int subtractNumbers(int num1, int num2)
{
	return num1-num2;
}
public static int multiplyNumbers(int num1, int num2) 
{
	return num1*num2;
}
public static double divideNumbers(double num1, double num2) 
{
	return num1/num2;
}
public static int findRemainder(int num1, int num2) 
{
	return num1%num2;
}

}//this is the closing of the class
