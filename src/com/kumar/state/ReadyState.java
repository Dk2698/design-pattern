package com.kumar.state;

/**
 * Represents the Ready state of the phone.
 */
public class ReadyState extends State {
    public ReadyState(Phone phone) {
        super(phone);
    }

    @Override
    public String onHome() {
        // Perform action for home button in Ready state
        return phone.home();
    }

    @Override
    public String onOffOn() {
        // Transition to Off state when on/off button is pressed
        phone.setState(new OffState(phone));
        return phone.lock();
    }
}
