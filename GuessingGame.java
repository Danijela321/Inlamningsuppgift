
import java.io.Console;

public class GuessingGame
{
	public static void main(String[] args)
	{
	//declaration and initialization of variables 
	int _low=0;
	int _high=1000;
	//skapar objekt
	//passing the values of variabels to the constructor
	Guesser guesser = new Guesser(_low,_high);
	guesser.start();//anropar metoden som ligger i class Guesser
	}
}
