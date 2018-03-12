public class InternetRadio implements IConnect {

    public String connect(String data) {
        return "Connecting to: " + data;
    }

    public String tune(String station) {
        return "Tuned to: " + station;
    }
}
