import java.util.Scanner;

public class JouneryCalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Speed And Time as real number");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculator journeyCalculator=new JourneyCalculator();
		System.out.printf("%.2f",journeyCalculator.calculateDistance(speed,time));
	}
}
