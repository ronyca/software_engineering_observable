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
		int xCount = this.current / 3;
		int space = xCount - 9;
		if (space > 0) {
			System.out.printf("%" + space + "sCurrent: %d\n", "", this.current);
		}
		else {
			System.out.printf("Current: %d\n", this.current);
		}
		for (int i = 0; i < xCount; i++) {
			System.out.print("X");
		}
		System.out.println("^");
		for (int i = 0; i <= 7; i ++) {
			if (i != 7) {
				System.out.printf("%-10d", i * 30);
			}
			else {
				System.out.printf("%d\n", i * 30);
			}
		}
		System.out.println();
    }
}