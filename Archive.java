import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

public class Archive implements Observer {
    private ArrayList<Record> archive;

    public Archive() {
        this.archive = new ArrayList<Record>();
    }

    public void update(Observable o, Object arg) {
        int temp = (int) arg;
        this.archive.add(new Record(temp));
        System.out.println("Temperature History");
        System.out.println("Timestamp             \tValue");
        for (Record record : this.archive) {
            System.out.printf("%-22s\t%d\n", record.getTimestamp(), record.getTemp());
        }
        System.out.println();
    }
}