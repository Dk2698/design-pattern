package com.kumar.state;

/**
 * Abstract state class representing a state of the phone.
 */
public abstract class State {
    protected Phone phone;

    protected State(Phone phone) {
        this.phone = phone;
    }

    // Action to perform when home button is pressed
    public abstract String onHome();

    // Action to perform when on/off button is pressed
    public abstract String onOffOn();
}
