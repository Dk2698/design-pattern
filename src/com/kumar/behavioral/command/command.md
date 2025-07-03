# Command Design Pattern in Java

The Command design pattern encapsulates a request as an object, thereby allowing for parameterization of clients with different requests, queuing of requests, and logging of the requests. It also supports undoable operations. This pattern consists of four main components: Command, Receiver, Invoker, and Client.

## Components of the Command Pattern

1. **Command**: An interface that declares methods for executing and undoing commands.
2. **ConcreteCommand**: Implements the Command interface and defines the binding between a receiver and an action.
3. **Receiver**: The class that knows how to perform the operations associated with carrying out a request.
4. **Invoker**: The class that asks the command to execute the request.
5. **Client**: The class that creates the command and sets its receiver.

## Example Implementation

### 1. Command Interface
**`Command.java`**

```java
package com.kumar.behavioral.command.command;

public interface Command {
    void execute(); // Executes the command

    void undo();    // Undoes the command
}
```
### 2. Light Class (Receiver)
**`Light.java`**

```java
package com.kumar.behavioral.command.receiver;

public class Light {
    public void on() {
        System.out.println("Light is on");
    }

    public void off() {
        System.out.println("Light is off");
    }
}
```
### 3. LightOnCommand Class
**`LightOnCommand.java`**

```java
package com.kumar.behavioral.command.command;

import com.kumar.behavioral.command.receiver.Light;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on(); // Calls the receiver to turn the light on
    }

    @Override
    public void undo() {
        light.off(); // Calls the receiver to turn the light off
    }
}
```

### 4. LightOffCommand Class
**`LightOffCommand.java`**

```java
package com.kumar.behavioral.command.command;

import com.kumar.behavioral.command.receiver.Light;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off(); // Calls the receiver to turn the light off
    }

    @Override
    public void undo() {
        light.on(); // Calls the receiver to turn the light on
    }
}
```
### 5. NoCommand Class
**`NoCommand.java`**

```java
package com.kumar.behavioral.command.command;

public class NoCommand implements Command {
    @Override
    public void execute() {
        // No action performed
    }

    @Override
    public void undo() {
        // No action performed
    }
}
```
### 6. RemoteControl Class (Invoker)

```java
package com.kumar.behavioral.command.invoker;

import com.kumar.behavioral.command.command.Command;
import com.kumar.behavioral.command.command.NoCommand;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        // Initialize all commands to NoCommand
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setOnCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand; // Set the command for the on button
        offCommands[slot] = offCommand; // Set the command for the off button
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute(); // Execute the command for the on button
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute(); // Execute the command for the off button
    }

    @Override
    public String toString() {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("\n------ Remote Control ------");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot ").append(i).append("] ")
                    .append(onCommands[i].getClass().getName())
                    .append("  ").append(offCommands[i].getClass().getName()).append("\n");
        }
        return stringBuffer.toString();
    }
}
```
### 7. RemoteTestDrive Class (Client)
**`RemoteTestDrive.java`**

```java
package com.kumar.behavioral.command.client;

import com.kumar.behavioral.command.invoker.RemoteControl;
import com.kumar.behavioral.command.command.LightOnCommand;
import com.kumar.behavioral.command.command.LightOffCommand;
import com.kumar.behavioral.command.receiver.Light;

public class RemoteTestDrive {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light(); // Create a receiver
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight); // Create command to turn on
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight); // Create command to turn off

        // Setting commands in the remote
        remoteControl.setOnCommand(0, livingRoomLightOn, livingRoomLightOff);

        // Simulating button presses
        remoteControl.onButtonWasPushed(0); // Light is on
        remoteControl.offButtonWasPushed(0); // Light is off
    }
}
```