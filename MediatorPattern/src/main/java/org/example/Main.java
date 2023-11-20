package org.example;

public class Main {
    public static void main(String[] args) {
        FlightControl flightControl = new FlightControlImplementation();
        Station station = new Station(flightControl);
        Spaceship spaceship = new Spaceship(flightControl);
        System.out.println(station.status());
        System.out.println(spaceship.status());
        flightControl.dockingPermission();
        flightControl.initDock();
        System.out.println(station.status());
        System.out.println(spaceship.status());
    }
}