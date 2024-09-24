package com.kumar.memento;

public class MementoTestDrive {
    public static void main(String[] args) {
        final ConfigurationCareTaker careTaker = new ConfigurationCareTaker();

        final ConfigurationOriginator originator = new ConfigurationOriginator(5, 10);

        // save it
        final ConfigurationMemento snapshot = originator.createMemento();

        // add it to history
        careTaker.addMemento(snapshot);

        // originator changes to new state
        originator.setHeight(7);
        originator.setWidth(14);

        // save it
        ConfigurationMemento snapshot1 = originator.createMemento();

        // add it to history
        careTaker.addMemento(snapshot1);

        // originator changes to new state
        originator.setHeight(9);
        originator.setWidth(18);

        // undo
        final ConfigurationMemento restoreStateMemento = careTaker.undo();
        originator.restoreMemento(restoreStateMemento);

        System.out.println("Height: " + originator.getHeight() + " Width: " + originator.getWidth());

    }
}
