package smarthomecontroller;

public class Smartlight implements Devices {
    public void run(){
        System.out.println("light turned on");
    }
    public void stop(){
        System.out.println("light turned off");
    }
}
