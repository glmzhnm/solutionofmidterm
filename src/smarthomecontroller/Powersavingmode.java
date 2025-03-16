package smarthomecontroller;
//power saving mode for economy electric
public class Powersavingmode extends FirstDecorator {
    private final long Maxtime;
    private long starttime;
    private boolean Stopped = false;

    public Powersavingmode(Devices device, long Maxtime) {
        super(device);
        this.Maxtime = Maxtime;
    }

    public void run() {
        starttime = System.currentTimeMillis();
        System.out.println("Powersavingmode activated  " + wrappeddevice.getClass().getSimpleName());
        super.run();
    }

    public void stop() {
        System.out.println("Powersavingmode stopping " + wrappeddevice.getClass().getSimpleName());
        super.stop();
        Stopped = true;
    }

    protected synchronized void checkAndStop() {
        long currentTime = System.currentTimeMillis();
        if (currentTime - starttime >= Maxtime) {
            System.out.println("Power off: " + wrappeddevice.getClass().getSimpleName());
            stop();
        }
    }
}
