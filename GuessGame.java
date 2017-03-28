import java.util.Scanner;

public class GameRules{
	int computerGuess;

	int computerGuess =  (Math.random() * 10);

	Scanner sc = new Scanner(System.in);
	

	System.out.print 
	int playerGuess = sc.nextInt();

	if (playerGuess<9 && playerGuess>0){
		if(playerGuess == computerGuess){
			System.out.println("You got it right");
		}else
		System.out.println("Try again");

	}



}




public class GuessGame{
	public static void main(Strings [] args){
		GameRules();
	}
}