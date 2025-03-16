package smarthomecontroller;
//facade patter
public class HomeController {
    private final DeviceGroup maingroup = new DeviceGroup();
    public void register(Devices device){
        maingroup.include(device);}
    public void enableall(){
        maingroup.run();
    }
    public void disableall(){
        maingroup.stop();
    }
}
