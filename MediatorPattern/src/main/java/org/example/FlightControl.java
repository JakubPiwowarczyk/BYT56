package org.example;

public interface FlightControl {

    void registerSpaceship(Spaceship spaceship);
    void registerStation(Station station);
    void dockingPermission();
    void initDock();
}
