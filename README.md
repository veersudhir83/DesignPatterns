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
 
> **Examples:** 

### Facade
 
> **Examples:** 

### FlyWeight
 
> **Examples:** 

### Proxy
 
> **Examples:** 
