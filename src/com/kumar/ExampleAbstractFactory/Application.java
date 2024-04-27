package com.kumar.ExampleAbstractFactory;

import com.kumar.ExampleAbstractFactory.uiFactory.UIFactory;

public class Application {
    private  Button button;
    private  CheckBox checkBox;

    public   Application(UIFactory factory){
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public  void paint(){
        button.paint();
        button.paint();
    }
}
