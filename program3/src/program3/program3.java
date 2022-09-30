package program3;
import java.util.*;

public class program3{
	public static void main(String args[]) {
		
		Scanner n = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = n.nextLine();
		
		Scanner number1 = new Scanner(System.in);
		System.out.print("Give a number from 0 to 100 ");
		int number = number1.nextInt();
		
		while (number > 0 && number < 100) {
				System.out.println("Thank you for your input, " + name);
				
			if (number < 0 || number > 100){
				Scanner number2 = new Scanner(System.in);
				System.out.print("Pleace entet a number between 0 and 100 ");
				number = number2.nextInt();
			}
			break;
		}
		while (number < 0 || number > 100) {
			
			if (number < 0 || number > 100){
				Scanner number2 = new Scanner(System.in);
				System.out.print("Pleace entet a number between 0 and 100 ");
				number = number2.nextInt();
			}
			
		}
		System.out.println("Starting the countdown...");
		
		for (int i = number; i >= 0; i-- ) {
			
			System.out.println("####################");
			System.out.println("#######  " + i +"  ########");
			System.out.println("####################");
			System.out.println();
		}
	}

}
