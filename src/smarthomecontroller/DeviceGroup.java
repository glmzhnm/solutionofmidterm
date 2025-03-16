package smarthomecontroller;
import java.util.ArrayList;
import java.util.List;
//in this class i use composite pattern
public class DeviceGroup implements Devices{
private final List<Devices> Alldevices = new ArrayList<>();
    public void include(Devices device){
    Alldevices.add(device);}
    public void delete(Devices device){
    Alldevices.remove(device);}
    public void run(){
        for(Devices device:Alldevices){
            device.run();
        }
    }
    public void stop(){
        for(Devices device:Alldevices){
            device.stop();
        }
    }
}
