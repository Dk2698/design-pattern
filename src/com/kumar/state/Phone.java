package com.kumar.state;

/**
 * Represents a phone with different states (Off, Locked, Ready).
 */
public class Phone {
    private State state;

    public Phone() {
        // Initialize the phone in the Off state
        state = new OffState(this);
    }

    // Set a new state for the phone
    public void setState(State state) {
        this.state = state;
    }

    // Lock the phone and turn off the screen
    public String lock() {
        return "Locking phone and turning off the screen";
    }

    // Go to the home screen
    public String home() {
        return "Going to home-screen";
    }

    // Unlock the phone to go to home
    public String unLock() {
        return "Unlocking the phone to home";
    }

    // Turn on the screen, device remains locked
    public String turnOn() {
        return "Turning screen on, device still locked";
    }

    // Handle action on home button
    public String pressHome() {
        return state.onHome();
    }

    // Handle action on on/off button
    public String pressOnOff() {
        return state.onOffOn();
    }
}
