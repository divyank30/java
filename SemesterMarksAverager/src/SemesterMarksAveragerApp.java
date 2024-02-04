import java.util.Scanner;

public class SemesterMarksAveragerApp {
public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter All eight Semsester marks");
	int sem1=scan.nextInt();
	int sem2=scan.nextInt();
	int sem3=scan.nextInt();
	int sem4=scan.nextInt();
	int sem5=scan.nextInt();
	int sem6=scan.nextInt();
	int sem7=scan.nextInt();
	int sem8=scan.nextInt();
	//SemesterMarksAverager average=new SemesterMarksAverager();
	//need not to create object because there is a static method  which is in other class
	//if u want to call call it by its  class name in which it is present
	System.out.printf("%.2f",SemesterMarksAverager.calculateAverage(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8));
	scan.close();
}
}
