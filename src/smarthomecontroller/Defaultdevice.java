package smarthomecontroller;
//delegates commands
public class Defaultdevice implements Devices{
    private Devices component;
    public Defaultdevice(Devices component){
        this.component=component;
    }
    public void run(){ component.run();}
    public void stop(){ component.stop();}
}
