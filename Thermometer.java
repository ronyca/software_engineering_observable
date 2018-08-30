import java.util.Observer;

public class Thermometer implements Observer {

	public void notfiyObserver() {

	}

	public void AskTemps() {
		int entry = 0;
		Scanner kb = new Scanner(System.in);
		while (entry != 9999) {
			System.out.println("Enter Temperature: ");
			if (entry == 9999) {
				System.out.println("Goodbye");
			} else {
				notifyObservers();
			}
		}

	}

}
