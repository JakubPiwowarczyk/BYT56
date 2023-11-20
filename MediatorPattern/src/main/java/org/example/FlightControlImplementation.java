package org.example;

public class FlightControlImplementation implements FlightControl{

    private Spaceship spaceship;
    private boolean spaceshipReady = false;
    private Station station;
    private boolean stationReady = false;

    @Override
    public void registerSpaceship(Spaceship spaceship) {
        this.spaceship = spaceship;
        System.out.println("[FLIGHT CONTROL]: Ship successfully registered");
    }

    @Override
    public void registerStation(Station station) {
        this.station = station;
        System.out.println("[FLIGHT CONTROL]: Station successfully registered");
    }

    @Override
    public void dockingPermission() {
        stationReady = station.getReadyToDock();
        spaceshipReady = spaceship.getReadyToDock();
    }

    @Override
    public void initDock() {
        if(spaceshipReady && stationReady){
            station.initDock();
            spaceship.initDock();
        }else {
            System.out.println("[FLIGHT CONTROL]: Ship or Station is not ready for dock");
        }
    }
}
