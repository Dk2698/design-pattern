package com.kumar.command.client;

import com.kumar.command.command.LightOffCommand;
import com.kumar.command.invoker.RemoteControl;
import com.kumar.command.receiver.Light;

public class RemoteTestDrive {

    public static void main(String[] args) {
//        final RemoteControl remoteControl = new RemoteControl(new LightOffCommand(new Light()), new LightOffCommand(new Light()));
//        remoteControl.clickOn();
//        remoteControl.clickOff();

        RemoteControl remoteControl = new RemoteControl();

    }
}
