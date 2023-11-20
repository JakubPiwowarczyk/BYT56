package org.example;

public class Spaceship implements Command{

    private final FlightControl flightControl;
    private boolean docked = false;

    public Spaceship(FlightControl flightControl) {
        this.flightControl = flightControl;
        register();
    }

    @Override
    public void register() {
        flightControl.registerSpaceship(this);
    }

    @Override
    public boolean getReadyToDock() {
        System.out.println("[SHIP]: Ship is ready to dock");
        return true;
    }

    @Override
    public void initDock() {
        System.out.println("[SHIP]: Ship successfully docked!");
        docked = true;
    }

    @Override
    public String status() {
        if(docked){
            return "[SHIP]: Ship has docked";
        }else{
            return "[SHIP]: Ship is in the space";
        }
    }
}
