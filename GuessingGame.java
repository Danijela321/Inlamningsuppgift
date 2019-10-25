
import java.io.Console;

public class GuessingGame
{
	public static void main(String[] args)
	{
	//skapar objekt
	Guesser guesser = new Guesser(0,1000);
	guesser.start();//anropar metoden som ligger i class Guesser
	}
}
