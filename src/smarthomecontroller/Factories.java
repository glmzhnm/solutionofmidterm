package smarthomecontroller;
//abstract factory patten
public interface Factories {
    Smartlight producelight();
    Smartthermostat producethermostat();
    Securitysystem producesecuritysystem();
}
