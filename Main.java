import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Boquet boquet = new Boquet();
		int menu = 1;
		while (menu==1) {
			System.out.println("Hello, what do you want? ");
			System.out.println("1 - add new element; 2 - output");
			int choice;
			Scanner in = new Scanner(System.in);
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Input name");
				String name = in.next();
				boquet.addFlower(name);
				break;
			case 2:
				boquet.output();
				break;
			}
			System.out.println("Do you want to continue? 1 - yes; 0 -no");
			menu = in.nextInt();
		}
	}
}
