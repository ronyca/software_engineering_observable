import java.sql.Timestamp;
import java.util.Observable;
import java.util.Scanner;
//THIS CLASS IS THE SUBJECT

public class Thermometer extends Observable{

public static void main(String[] args)
public void notfiyObserver()
{
	
}
public void AskTemps()
{
	int entry = 0;
	Scanner kb = new Scanner(System.in);
	while(entry!=9999)
	{
		System.out.println("Enter Temperature: ");
		if(entry == 9999)
		{
			System.out.println("Goodbye");
		}
		else
		{
			notifyObservers();
		}
	}

}



}
