package com.kumar.command.invoker;

import com.kumar.command.command.Command;
import com.kumar.command.command.NoCommand;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
//    private Command up;
//    private Command down;

//    public RemoteControl(Command on, Command off) {
//        this.on = on;
//        this.off = off;
////        this.up = up;
////        this.down = down;
//    }

//    public void clickOn(){
//        this.on.execute();
//    }
//
//    public void clickOff(){
//        this.off.undo();
//    }

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public  void setOnCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot){
        onCommands[slot].execute();
    }

    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n ------ Remote Control ------");
        for (int i = 0; i <onCommands.length ; i++) {
            stringBuffer.append("[slot "+ i + "]"+ onCommands[i].getClass().getName()+
                    " "+ offCommands[i].getClass().getName()+ "\n");
        }
        return stringBuffer.toString();
    }
}
