package smarthomecontroller;

public class Defaultdevice implements Devices{
    private Devices component;
    public void setComponent(Devices component){
        this.component=component;
    }
    public void run(){ component.run();}
    public void stop(){ component.stop();}
}
