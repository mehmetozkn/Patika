
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a,b,c;
		double u;
		double alan;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1.Kenar : ");
		a = scanner.nextInt();
		
		System.out.print("2.Kenar : ");
		b = scanner.nextInt();
		
		System.out.print("3.Kenar : ");
		c = scanner.nextInt();
		
		u = (a+b+c) / 2;
		
		alan = Math.sqrt((u*(u-a)*(u-b)*(u-c)));
		System.out.println("Alan : " + alan);
		
		
		
		

	}

}
