import java.sql.Timestamp;
import java.util.Observable;
import java.util.Scanner;

public class MachineRoomMonitor extends Observable{
    private Archive archive;
    private Alert alert;
    private Thermometer thermometer;
    public MachineRoomMonitor() {
        this.archive = new Archive();
        this.alert = new Alert();
        this.thermometer = new Thermometer();
    }
}
