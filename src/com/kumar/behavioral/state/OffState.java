package com.kumar.behavioral.state;

/**
 * Represents the Off state of the phone.
 */
public class OffState extends State {
    public OffState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        // Transition to Locked state when home button is pressed
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }

    @Override
    public String onOffOn() {
        // Remain in Locked state, turn the screen on
        phone.setState(new LockedState(phone));
        return phone.turnOn();
    }
}
