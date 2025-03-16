package smarthomecontroller;
//main class for starting
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Factories factory = new Devicefactory();
        HomeController controller = new HomeController();
        Devices light = new Powersavingmode(new LogFeature(new Defaultdevice(new Smartlight())), 5500);
        Devices thermostat = new Powersavingmode(new Defaultdevice(new Smartthermostat()), 6900);
        Devices doorlock = new AdapterLock(new DoorLock());
        controller.register(light);
        controller.register(thermostat);
        controller.register(doorlock);
        controller.enableall();
        Thread.sleep(5500);
        if (light instanceof Powersavingmode) {
            ((Powersavingmode) light).checkAndStop();
        }

        Thread.sleep(6900);
        if (thermostat instanceof Powersavingmode) {
            ((Powersavingmode) thermostat).checkAndStop();
        }
        controller.disableall();
        }
    }
