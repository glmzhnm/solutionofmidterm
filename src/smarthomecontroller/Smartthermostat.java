package smarthomecontroller;

public class Smartthermostat implements Devices{
     public void run() {
    System.out.println("thermostat start checking room's temperature");
    }
    public void stop(){
         System.out.println("thermostat turned off");
    }
}
