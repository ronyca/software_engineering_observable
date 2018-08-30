import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

public class Archive implements Observer {
    private ArrayList<Archvive> archive;
    public Archive() {
        this.archive = new ArrayList<Archive>();
    }
    public void update(Observable o, Object arg) {
        Float temp = (Float) arg;
        this.archive.add(this.archive.size(), new Record(temp));
    }
}