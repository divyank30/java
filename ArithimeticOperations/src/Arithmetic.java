

public class Arithmetic{
public static void main(String[] args) {
	int res1=subtractNumbers(20, 5); 
	System.out.println(res1);

	int res2=multiplyNumbers(4, 5); 
	System.out.println(res2);

	double res3=divideNumbers(22, 7);
	System.out.printf("%.2f\n",res3);

	int res4=findRemainder(10, 3);
	System.out.println(res4);
	
}// This is the closing of the main

public static int subtractNumbers(int num1, int num2)
{
	return num1-num2;
}
public static int multiplyNumbers(int num1, int num2) 
{
	return num1*num2;
}
public static double divideNumbers(int num1, int num2) 
{
	return num1/num2;
}
public static int findRemainder(int num1, int num2) 
{
	return num1%num2;
}

}//this is the closing of the class

