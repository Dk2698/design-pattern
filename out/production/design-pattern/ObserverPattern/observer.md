### Publishers + Subscribers = Observer
#### The Observer Pattern it's one to many relationship and loosly coupling
Observer Pattern is one of the behavioral design pattern. Observer design pattern is useful
when you are interested in the state of an object and want to get notified whenever there is any change. 
In observer pattern, the object that watch on the state of another object are called Observer and the object 
that is being watched is called Subject or Observable.

Observer Pattern , only we call the publisher the SUBJECT and the Subscribers the OBSERVERS

### Observer Pattern defined
According to GoF, observer design pattern intent is;

#### Define a one-to-many dependency between objects so that when one object changes state,all its dependents are notified and updated automatically.
#### The Subjects and observers define the one-to-many relationship. we have one subject, who notifies many observers when something in the subject changes. the Observers are dependent on the subject - when the subjects state change, the observer are nofified
Subject contains a list of observers to notify of any change in it’s state,
so it should provide methods using which observers can register and unregister themselves. 
Subject also contain a method to notify all the observers of any change and
either it can send the update while notifying the observer or it can provide another method to get the update. 
Observer should have a method to set the object to watch and another method that will be used by Subject to notify them of any updates.
Java provides inbuilt platform for implementing Observer pattern through java.util.Observable class and java.util.Observer interface.
However it’s not widely used because the implementation is really simple and most of the times we don’t want to end up extending a class
just for implementing Observer pattern as java doesn’t provide multiple inheritance in classes. Java Message Service (JMS) uses Observer design pattern along with Mediator pattern
to allow applications to subscribe and publish data to other applications. 
Model-View-Controller (MVC) frameworks also use Observer pattern where Model is the Subject and Views are observers that can register to get notified of any change to the model.

#### Observer design pattern is also called as publish-subscribe pattern

### The Power of loose Coupling
when two objects are loosely coupled, they can interact but they
typically have very little knowledge of ech other
it's give us a lot of flexibility
    
    First, the only thing the subject knows about an observer that it implements a 
    a certain interface(the Observer interface).
    We can add new observers at any time.
    We never need to modify the subject to add new types of observers
    We can can reuse subject or observers independently of each other
    Change to either the subject or an observer wil not affect the other

## Design Principle
### Strive for loosely coupled designs between objects that interact
#### Loosely coupled design allows us to  build flexible OO  systems that can handle changes because they minimize the interdependency between objects
