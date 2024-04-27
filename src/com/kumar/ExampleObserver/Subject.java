package com.kumar.ExampleObserver;

public interface Subject {
    public  void  registerObserver(Observer o); // these method take an  Observer as an argument that is the Observer to be registerd or removed
    public  void  removeObserver(Observer o);
    public  void  notifyObserver(); // this method is called to notify all observers when the subject stat has changed
}
