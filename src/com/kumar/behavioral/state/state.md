# State Design Pattern

## State Design Pattern Explanation

The State Design Pattern is a behavioral design pattern that allows an object to alter its behavior when its internal state changes. It encapsulates state-specific behavior in separate classes, which makes the code more organized and easier to maintain. Here's how it applies to the provided example of a Phone class:

## Explanation of the State Pattern

### Context Class (Phone)

- The `Phone` class acts as the context that holds a reference to one of the concrete state classes (e.g., `OffState`, `LockedState`, `ReadyState`).
- It has methods to change its state and delegate actions to the current state. This delegation allows the phone to behave differently depending on its state.

### State Interface (State)

- The `State` abstract class defines the interface for the various concrete states. It contains methods (`onHome` and `onOffOn`) that each state must implement.
- This abstraction allows the `Phone` class to call these methods without needing to know which specific state it is currently in.

### Concrete State Classes

- **`OffState`**: Represents the state when the phone is turned off. It can handle actions like turning on the screen or going to the locked state.
- **`LockedState`**: Represents the state when the phone is locked. It can unlock the phone or transition back to the off state.
- **`ReadyState`**: Represents the state when the phone is ready for use. It handles interactions when the home button is pressed or when the phone is turned off.

## How It Works in the Example

### Initialization

- When a `Phone` object is created, it initializes its state to `OffState`. This means that all actions will initially be handled according to the rules defined in `OffState`.

### State Transitions

- Each state can transition to another state by calling `phone.setState(new StateClass(phone))`. For example:
    - When the phone is off and the home button is pressed, it transitions to the `LockedState` and turns on the screen.
    - In `LockedState`, if the home button is pressed, it transitions to `ReadyState`, unlocking the phone.

### Encapsulation of Behavior

- Each state class encapsulates the behavior associated with that specific state. This avoids large conditional statements or switch-case statements in the `Phone` class, making the code cleaner and more maintainable.
- For example, pressing the home button while in `ReadyState` simply executes the `home()` method, while in `LockedState`, it executes the `unLock()` method and transitions to `ReadyState`.

## Benefits of Using the State Pattern

- **Clean Code**: The code for different states is separated into their respective classes, leading to better organization and readability.

- **Easy to Extend**: Adding new states or modifying existing states can be done independently without affecting other parts of the code.

- **Dynamic Behavior**: The behavior of the `Phone` can change dynamically based on its state, which is more intuitive and aligns with real-world usage.

- **Elimination of Conditionals**: It reduces the need for extensive conditional logic to manage the states, as each state's behavior is encapsulated within its own class.

## Code Implementation

**`Phone.java`**

```java
package com.kumar.behavioral.state;

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
```
**`State.java`**

```java
package com.kumar.behavioral.state;

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
```
**`LockedState.java`**

```java
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
```
**`OffState.java`**

```java
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
```
**`ReadyState.java`**

```java
package com.kumar.behavioral.state;

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
```
**`PhoneTestDrive.java`**

```java
package com.kumar.behavioral.state;

import javax.swing.*;

/**
 * Test drive for the Phone state management.
 */
public class PhoneTestDrive {
  public static void main(String[] args) {
    Phone phone = new Phone();

    // Create buttons for phone actions
    JButton homeButton = new JButton("Home");
    homeButton.addActionListener(e -> System.out.println(phone.pressHome()));

    JButton onOffButton = new JButton("On/OFF");
    onOffButton.addActionListener(e -> System.out.println(phone.pressOnOff()));

    // Setup GUI (if needed) to add buttons to the frame
    JFrame frame = new JFrame("Phone State Test");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new java.awt.FlowLayout());
    frame.add(homeButton);
    frame.add(onOffButton);
    frame.setSize(300, 100);
    frame.setVisible(true);
  }
}
```
## Conclusion

In summary, the State Design Pattern effectively models the behavior of a phone that can be in multiple states (Off, Locked, Ready) and changes its behavior based on its current state. By using this pattern, we achieve a more modular and maintainable code structure that closely resembles the real-world interactions of a phone.