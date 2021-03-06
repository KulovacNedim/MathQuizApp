
import java.util.Scanner;

public class MathQuizApp {

	public static void main(String[] args) {

		System.out.println("+----------------------------------------+");
		System.out.println("+                                        +");
		System.out.println("+     Welcome to Math Quiz Aplication!   +");
		System.out.println("+                                        +");
		System.out.println("+----------------------------------------+");
		
		showMenu();

	}

	static void showMenu() {
		
		Scanner sc = new Scanner(System.in);
		MathOperations mathOp = new MathOperations();
		
		System.out.println("\nChoose qiuz you want to try: \n");
		System.out.println("    1) Addition");
		System.out.println("    2) Substraction");
		System.out.println("    3) Multiplication");
		System.out.println("    4) Division");
		System.out.println("    5) Squaring");
		System.out.println("    6) Square rooting");

		System.out.print("\nEnter your choice: ");

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println("\nWelcome to Addition Quiz!\n");

			mathOp.additionOperation(sc);
			break;
		case 2:
			System.out.println("\nWelcome to Substraction Quiz!\n");

			mathOp.substractionOperation(sc);
			break;
		case 3:
			System.out.println("\nWelcome to Multiplication Quiz!\n");

			mathOp.multiplicationOperation(sc);
			break;
		case 4:
			System.out.println("\nWelcome to Division Quiz!\n");

			mathOp.divisionOperation(sc);
			break;
		case 5:
			System.out.println("\nWelcome to Squaring Quiz!\n");

			mathOp.squaringOperation(sc);
			break;
		case 6:
			System.out.println("\nWelcome to Square Rooting Quiz!\n");

			mathOp.rootingOperation(sc);
			break;
		default:
			
			while (choice < 1 || choice > 6) {
				System.out.print("\nWrong input! Try again.\n");
				
				showMenu();
			}
		}
		
	}

}
