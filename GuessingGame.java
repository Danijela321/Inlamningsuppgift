
import java.io.Console;
import java.util.Scanner;

public class GuessingGame
{
	public static void main(String[] args)
	{
	int _low=Integer.parseInt(args[0]);
	int _high=Integer.parseInt(args[1]);
	if(_high<_low)
	throw new IllegalArgumentException("The first parameter must be lower then the second");
 	else	
	{
	Guesser guesser = new Guesser(_low,_high);
        guesser.start();//anropar metoden som ligger i class Guesser
	}



/* stari kod
	//declaration and initialization of variables 
	int _low=0;
	int _high=1000;
	//skapar objekt
	//passing the values of variabels to the constructor
	Guesser guesser = new Guesser(_low,_high);
	guesser.start();//anropar metoden som ligger i class Guesser
*/	
}
}
