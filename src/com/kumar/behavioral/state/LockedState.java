package com.kumar.behavioral.state;

/**
 * Represents the Locked state of the phone.
 */
public class LockedState extends State {
    public LockedState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        // Transition to the Ready state when home button is pressed
        phone.setState(new ReadyState(phone));
        return phone.unLock();
    }

    @Override
    public String onOffOn() {
        // Transition to Off state when on/off button is pressed
        phone.setState(new OffState(phone));
        return phone.lock();
    }
}
