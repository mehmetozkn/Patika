
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int mesafe;
		double ucret;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Km : ");
		mesafe = scanner.nextInt();

		ucret = 10 + (mesafe * 2.20);

		if (ucret < 21) {
			ucret = 20;
		} else if (ucret > 20) {
			ucret = 10 + (mesafe * 2.20);
		}
		
		System.out.println("Ucret : " + ucret);

	}

}
