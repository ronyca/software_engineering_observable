import java.sql.Timestamp;
import java.util.Observable;
import java.util.Scanner;

public class MachineRoomMonitor extends Observable {
    private Archive archive;
    private Alert alert;
    private Thermometer thermometer;

    public static void main(String[] args) {
        MachineRoomMonitor monitor = new MachineRoomMonitor();
        monitor.AskTemps();
    }

    public MachineRoomMonitor() {
        this.archive = new Archive();
        this.alert = new Alert();
        this.thermometer = new Thermometer();
        addObserver(this.archive);
        addObserver(this.alert);
        addObserver(this.thermometer);
    }

    public void AskTemps() {
        int entry = 0;
        Scanner kb = new Scanner(System.in);
        while (entry != 9999) {
            System.out.println("Enter Temperature: ");
            entry = kb.nextInt();
            if (entry == 9999) {
                System.out.println("Goodbye");
            } else {
                notifyObservers(entry);
            }
        }
        kb.close();
    }
}
