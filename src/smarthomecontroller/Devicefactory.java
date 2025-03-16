package smarthomecontroller;

public class Devicefactory implements Factories{
    public Smartlight producelight() {
        return new Smartlight();
    }
    public Smartthermostat producethermostat() {
        return new Smartthermostat();
    }
    public Securitysystem producesecuritysystem() {
        return new Securitysystem();
    }
}
