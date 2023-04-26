 import 
  java.util.Scanner;


/** this is a guess game <p> you can enter a number to guess a rendom number generated
 @author Danish yousuf
 @version 3.0
 @since 2022
 @see javadoc.oracle*/


class game {
	public int number;
	public int inputted;
	public int attempts;

	game() {

		number = (int) (Math.random() * 10);

	}

	public int getInputted() {
		return inputted;
	}

	public void setInputted(int inputted) {

		this.inputted = inputted;
	}

	/**
	 * @return check condition for guessing
	 * 
		*/
	void  cheack() {
	
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		
		while (b) {
				attempts++;
			System.out.println("enter a number");
		inputted=sc.nextInt();
		
		if (number == inputted) {
			System.out.println("you guessed it correctly in " + attempts + " number of attempts");
			break;
			
		} else if (number > inputted) {
			System.out.println("lower than guessed");
		} else if (number < inputted) {
			System.out.println("greater than guessed");
		}
	
	}
		}


}

public class Guess_a_Number {
	/**
	 * @param args this is main method argument
		*/
	public static void main(String[] args) {
		// GUESS A NUMBER
		
		game guess = new game();
		guess.cheack();
		

	}


}