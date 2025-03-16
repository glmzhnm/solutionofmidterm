package smarthomecontroller;

public class AdapterLock implements Devices{
    private final DoorLock legacylock;
    public AdapterLock(DoorLock lock){
        this.legacylock = lock;
    }
    public void run() {
        legacylock.relief();
    }
    public void stop() {
        legacylock.secure();
    }
}
