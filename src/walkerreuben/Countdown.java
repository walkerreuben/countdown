package walkerreuben;

import java.text.ParseException;
import java.util.Scanner;

public class Countdown {

	static MyDate target = new MyDate();
	static MyDate current = new MyDate();

	public static void main(String[] args) {
		setDate(target);
		current = new MyDate();
		System.out.println(target.getDiffString(current) + " seconds until " + target.getName() + ".");
	}

	public static void setDate(MyDate date) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a name for the time you'd like to count down until.");
		date.setName(keyboard.nextLine());
		System.out.println("Please enter the time and date you'd like to count down to in hh:mm:ss, dd/MM/yyyy format.");
		boolean set = false;
		while (!set)
			try {
				date.setDate(keyboard.nextLine());
				set = true;
			} catch (ParseException e) {
				System.out.println("Incorrect format. Please try again in hh:mm:ss, dd/MM/yyyy format.");
			}
		keyboard.close();
	}
}