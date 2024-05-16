# SOLID
## Single Responsibility Principle (SRP)
"A class should have one, and only one, reason to change."

Break SRP?
Validting SRP?
```java
Class Simulation {
    public void loadSimulationFile(); // I/O Handling
    public void simulate(); // Calculation
    public void covertParams(); // Might also in calculation
}
```

- Always ask what the responsibility of the class/component (or microservice) is. *If the answer includes "and", then it's likely that SRP is violated.*

## Open/Closed Principle (OCP)
"Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification."