import java.util.Observable;
import java.util.Observer;

public class Thermometer implements Observer {
	int current;
    public Thermometer() {
		this.current = 0;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.current= (int) arg;
		System.out.printf("Current: %d", this.current);
		for (int i = 0; i < Math.ceil(this.current / 3.0); i++) {
			System.out.print("X");
		}
		System.out.println();
		for (int i = 0; i <= 7; i ++) {
			if (i != 7) {
				System.out.printf("%-10d", i * 30);
			}
			else {
				System.out.printf("%d\n", i * 30);
			}
		}
    }
}