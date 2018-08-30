import java.sql.Timestamp;

public class Record {
    private int temp;
    private Timestamp timestamp;

    public Record(int temp) {
        this.temp = temp;
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    public int getTemp() {
        return this.temp;
    }

    public String getTimestamp() {
        return this.timestamp.toString();
    }
}