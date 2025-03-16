package smarthomecontroller;

public class LogFeature extends FirstDecorator {
    public LogFeature(Devices device){super(device);}
    public void run(){
        System.out.println("running"+wrappeddevice.getClass().getSimpleName());
        super.run();}
    public void stop(){
        System.out.println("stopping"+wrappeddevice.getClass().getSimpleName());
        super.stop();
    }

}
