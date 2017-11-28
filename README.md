# DesignPatterns

## Creational Patterns:
### Singleton
Only one instance created; Guarantees control of a resource; Lazily Loaded; 
> **Examples:** Runtime, Logger, Spring Beans

### Builder
Handles Complex constructors; Large Number of Parameters; Immutability;
> **Examples:** StringBuilder, DocumentBuilder, Locale.Builder

### Prototype
Avoids Costly creation; Avoids sub-classing; Doesn't use **new**; Usually implemented with a Registry;
> **Examples:** java.lang.Object#clone()

### Factory
Doesn't expose instantiation logic; Defer to sub-classes; Common Interface; Specified by Architecture and implemented by user;
> **Examples:** Calendar, ResourceBundle, NumberFormat

### Abstract Factory
Factory of Factories; Factory of related objects; Common Interface; Defer to sub-classes
> **Examples:** DocumentBuilderFactory, Frameworks  


## Structural Patterns:
### Adapter
Client centric; Integrate New with Old; Could be an interface but not required to be always; Adaptee can be the implementation; Translates requests 
Do Not related it with a classic physical adapter example which connects only to one interface; Do not add functionality - it becomes decorator
> **Examples:** Collections (Arrays to List), Streams

### Bridge
 
> **Examples:** 

### Composite
 
> **Examples:** 

### Decorator
Add responsibilities to objects dynamically 
> **Examples:** Java IO Class Structure - To create a LineNumberInputStream we do something like LineNumberInputStream(BufferedInputStream(FileInputStream))); BufferedInputStream is a decorator for FileInputStream. LineNumberInputStream is a decorator for BufferedInputStream

### Facade
A single class that represents an entire subsystem 
> **Examples:** Event Manager

### FlyWeight
 
> **Examples:** 

### Proxy
An object representing another object 
> **Examples:** Debit Card - It represents the bank account but is really not the bank account itself. It acts as a proxy to our Bank Account

## Behavioral Patterns:
### Chain of Responsibility
A way of passing a request between a chain of objects
> **Examples:** Loan or Leave Approval Process; Exception Handling in most programming languages

### Iterator
Sequentially access the elements of a collection
> **Examples:** 

### Strategy
Encapsulates an algorithm inside a class
> **Examples:** java.util.Comparator#compare()

### Observer
A way of notifying change to a number of classes 
> **Examples:** Online Bidding - Different people can register as observers. They all are notified when there is a new bid; Observer interface and Observable class in Java.

### Template Method
Defer the exact steps of an algorithm to a subclass    
 
> **Examples:** House Plan, implementation of Spring AbstractController

### Memento
Capture and restore an object's internal state

> **Examples:**  Intermediate save feature in games; Undo / Redo Operations in text or image editing software

### Mediator
Defines simplified communication between classes

> **Examples:** Enterprise Service Bus - Instead of allowing applications to directly communicate with each other they go through an ESB; Air Traffic Controller. All the flights talk to ATC to decide the route to take.

### Memento
Capture and restore an object's internal state

> **Examples:** 