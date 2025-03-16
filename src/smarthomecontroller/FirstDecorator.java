package smarthomecontroller;
//decorator pattern for decorating device
public abstract class FirstDecorator implements Devices{
    protected Devices wrappeddevice;
    public FirstDecorator(Devices device){
        this.wrappeddevice = device;
    }
    public void run(){ wrappeddevice.run();}
    public void stop(){ wrappeddevice.stop();}
}
