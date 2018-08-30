import java.util.Observable;
import java.util.Observer;

public class Alert implements Observer {
    public Alert() {
    }

    @Override
    public void update(Observable o, Object arg) {
        int temp = (int) arg;
        if (temp > 110) {
            System.out.println("Warning: Temperature is dangerously high.");
        } else if (temp < 32) {
            System.out.println("Warning: Temperature is dangerously low.");
        }
    }
}