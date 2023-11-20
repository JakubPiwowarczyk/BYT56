package org.example;

public class Station implements Command{

    private final FlightControl flightControl;
    private boolean occupied = false;

    public Station(FlightControl flightControl) {
        this.flightControl = flightControl;
        register();
    }

    @Override
    public void register() {
        flightControl.registerStation(this);
    }

    @Override
    public boolean getReadyToDock() {
        System.out.println("[STATION]: Station is ready for ship to dock");
        return true;
    }

    @Override
    public void initDock() {
        System.out.println("[STATION]: Ship successfully docked!");
        occupied = true;
    }

    @Override
    public String status() {
        if(occupied){
            return "[STATION]: Station is occupied";
        }else{
            return "[STATION]: Station is not occupied";
        }
    }
}
