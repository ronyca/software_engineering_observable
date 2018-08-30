import java.sql.Timestamp;

public class Record {
    private Float temp;
    private Timestamp timestamp;
    public Record(Float temp) {
        this.temp = temp;
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }
    public getTemp() {
        return this.temp;
    }
    public getTimestamp() {
        return this.timestamp;
    }
}