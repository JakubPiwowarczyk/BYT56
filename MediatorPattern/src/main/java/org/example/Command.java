package org.example;

public interface Command {

    void register();

    boolean getReadyToDock();

    void initDock();

    String status();

}
