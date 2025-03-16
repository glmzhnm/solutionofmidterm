# solutionofmidterm
midterm design patterns
![запуск главный](https://github.com/user-attachments/assets/e3746561-0cf1-4dd9-89a8-8a66c3cd4afe)
you can see output of my project![запуск главный is name of the photo]
1. Composite Pattern
Allows grouping of individual devices into collections (e.g., a room containing multiple devices), Implemented via DeviceGroup, which manages multiple Devices, Supports recursive control over all included devices.
2. Decorator Pattern
Dynamically adds functionalities to existing devices without modifying their core implementation, Implemented FirstDecorator and specific decorators like LogFeature (adds logging) and Powersavingmode (automatically stops a device after a given time).
3. Abstract Factory Pattern
Provides a way to create families of related devices without specifying their exact classes, Implemented  Factories interface and Devicefactory concrete class.
4. Facade Pattern
Simplifies user interaction with the system by providing a single interface for managing devices, Implemented HomeController, which handles adding devices, turning them on/off, and organizing them into groups.
5. Adapter Pattern
Integrates legacy or third-party systems by adapting their interfaces to match the system’s expectations. Implemented AdapterLock, which adapts DoorLock to conform to the Devices interface.
Class Descriptions
Main.java
Entry point of the application. Creates devices using factories, Registers devices in HomeController, Enables and disables all devices.
Devices.java
Interface defining common actions (run() and stop()) for all smart devices.
Defaultdevice.java
A basic implementation of Devices that delegates operations to another device.
DeviceGroup.java
Implements the Composite Pattern, Allows treating multiple devices as a single unit.
Factories.java
Defines an Abstract Factory for producing different smart devices.
Devicefactory.java
Concrete factory for creating instances of smart devices (Smartlight, Smartthermostat, Securitysystem).
Smartlight.java
Implements Devices to represent a smart light, Turns on/off the light when run() and stop() are called.
Smartthermostat.java
Implements Devices to simulate temperature monitoring.
Securitysystem.java
Implements Devices to simulate a home security system.
FirstDecorator.java
Abstract class implementing the Decorator Pattern, Allows extending device functionality dynamically.
LogFeature.java
Concrete decorator that logs device actions when they are turned on/off.
Powersavingmode.java
Concrete decorator that turns off a device automatically after a specified time., Uses a background thread to monitor elapsed time.
AdapterLock.java
Implements the Adapter Pattern to integrate DoorLock into the system.
DoorLock.java
Represents a legacy security system that has secure() and relief() methods, Adapted by AdapterLock to fit the Devices interface.
HomeController.java
Implements the Facade Pattern to simplify device management, Registers devices and manages batch operations (turning all devices on/off).
Execution Flow
The program starts in Main.java.
Devices are created using Devicefactory.
Devices are wrapped with decorators for added functionality (logging, power-saving mode).
Devices are registered with HomeController.
The system enables all devices, demonstrating their operations.
The system disables all devices, showing the stopping process.
![запуск главный](https://github.com/user-attachments/assets/e3746561-0cf1-4dd9-89a8-8a66c3cd4afe)
you can see output of my project!


