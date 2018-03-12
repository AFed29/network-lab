import java.util.*;

public class Network {
    private String name;
    private ArrayList<IConnect> devices;
    private int capacity;

    public Network(String name, int capacity){
        this.devices = new ArrayList<>();
        this.name = name;
        this.capacity = capacity;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return devices.size();
    }

    public void connect(IConnect device){
        if (freeSlots() > 0) {
            devices.add(device);
        }
    }

    public void disconnectAll(){
        devices.clear();
    }

    public int getCapacity() {
        return capacity;
    }

    public int freeSlots() {
        return capacity - deviceCount();
    }
}