
import java.util.Scanner;

public class MathOperations {

	public void additionOperation(Scanner sc) {

		System.out.print("How many questions you want to be asked? ");
		int brojPitanja = sc.nextInt();
		int brojTacnihOdgovora = 0;

		for (int i = 0; i < brojPitanja; i++) {

			int number_1 = (int) (Math.random() * 10) + 1;
			int number_2 = (int) (Math.random() * 10) + 1;

			System.out.print("\nWhat is " + number_1 + " + " + number_2 + "? ");
			int result = sc.nextInt();

			if (result == number_1 + number_2) {
				System.out.println("Correct answer!\n");
				brojTacnihOdgovora++;
			} else {
				System.out.println("Wrong answer! Correct answer is " + (number_1 + number_2));
			}
		}
		
		System.out.println("You answered correctly " + brojTacnihOdgovora + " of " + brojPitanja + " asked questions.");

		System.out.println("\nPlay another game!\n");

		MathQuizApp.showMenu();

	}

	public void substractionOperation(Scanner sc) {

		System.out.print("How many questions you want to be asked? ");
		int brojPitanja = sc.nextInt();
		int brojTacnihOdgovora = 0;

		for (int i = 0; i < brojPitanja; i++) {

			int number_1 = (int) (Math.random() * 10) + 1;
			int number_2 = (int) (Math.random() * 10) + 1;

			System.out.print("\nWhat is " + number_1 + " - " + number_2 + "? ");
			int result = sc.nextInt();

			if (result == number_1 - number_2) {
				System.out.println("Correct answer!\n");
				brojTacnihOdgovora++;
			} else {
				System.out.println("Wrong answer! Correct answer is " + (number_1 - number_2));
			}
		}

		System.out.println("You answered correctly " + brojTacnihOdgovora + " of " + brojPitanja + " asked questions.");

		System.out.println("\nPlay another game!\n");

		MathQuizApp.showMenu();

	}

	public void multiplicationOperation(Scanner sc) {
		System.out.print("How many questions you want to be asked? ");
		int brojPitanja = sc.nextInt();
		int brojTacnihOdgovora = 0;

		for (int i = 0; i < brojPitanja; i++) {

			int number_1 = (int) (Math.random() * 10) + 1;
			int number_2 = (int) (Math.random() * 10) + 1;

			System.out.print("\nWhat is " + number_1 + " * " + number_2 + "? ");
			int result = sc.nextInt();

			if (result == number_1 * number_2) {
				System.out.println("Correct answer!\n");
				brojTacnihOdgovora++;
			} else {
				System.out.println("Wrong answer! Correct answer is " + (number_1 * number_2));
			}
		}

		System.out.println("You answered correctly " + brojTacnihOdgovora + " of " + brojPitanja + " asked questions.");

		System.out.println("\nPlay another game!\n");

		MathQuizApp.showMenu();

	}

	public void divisionOperation(Scanner sc) {

		System.out.print("How many questions you want to be asked? ");
		int brojPitanja = sc.nextInt();
		int brojTacnihOdgovora = 0;

		for (int i = 0; i < brojPitanja; i++) {

			double number_1 = (int) (Math.random() * 10) + 1;
			double number_2 = (int) (Math.random() * 10) + 1;

			System.out.print("\nWhat is " + number_1 + " / " + number_2 + "? ");
			double result = sc.nextInt();

			if (result == number_1 / number_2) {
				System.out.println("Correct answer!\n");
				brojTacnihOdgovora++;
			} else {
				System.out.println("Wrong answer! Correct answer is " + (number_1 / number_2));
			}
		}

		System.out.println("You answered correctly " + brojTacnihOdgovora + " of " + brojPitanja + " asked questions.");

		System.out.println("\nPlay another game!\n");

		MathQuizApp.showMenu();

	}

	public void squaringOperation(Scanner sc) {

		int counter = 0;

		System.out.print("How many questions you want to be asked? ");

		int questions = sc.nextInt();

		for (int i = 0; i < questions; i++) {

			int randomInt = ((int) (Math.random() * 9) + 1);

			System.out.print("\nWhat is square of " + randomInt + " ");

			int answer = sc.nextInt();

			if ((randomInt * randomInt) == answer) {
				System.out.println("Correct answer!\n");
				counter++;
			} else {
				System.out.println("Wrong answer! Correct answer is " + (randomInt * randomInt));
			}

		}

		System.out.println("You answered correctly " + counter + " of " + questions + " asked questions.");

		System.out.println("\nPlay another game!\n");

		MathQuizApp.showMenu();

	}

	public void rootingOperation(Scanner sc) {

		int counter = 0;

		System.out.print("How many questions you want to be asked? ");

		int questions = sc.nextInt();

		for (int i = 0; i < questions; i++) {

			boolean flag = false;
			int randomInt = 0;

			while (!flag) {

				for (int j = 1; j < 10; j++) {

					randomInt = ((int) (Math.random() * 80) + 1);

					if (j * j == randomInt) {

						flag = true;
						break;
					}
				}
			}

			System.out.print("\nWhat is square root of " + randomInt + " ");

			int answer = sc.nextInt();

			if (randomInt == (answer * answer)) {
				System.out.println("Correct answer!\n");
				counter++;
			} else {
				System.out.println("Wrong answer! Correct answer is " + (int) (Math.sqrt(randomInt)));
			}

		}

		System.out.println("You answered correctly " + counter + " of " + questions + " asked questions.");

		System.out.println("\nPlay another game!\n");

		MathQuizApp.showMenu();

	}

}
