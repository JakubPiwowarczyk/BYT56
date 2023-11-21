# BYT56

1. MediatorPattern - FlightControlImplementation is a mediator between a Spaceship and Station during the ship docking process.
2. ResponsibilityChainCalculator - The equation is passed from node to node in the chain until it finds one that is able to solve it (or handle the case when no node is able to solve it).
In both projects we can see an example of the use of template pattern. In 1 the Spaceship and Station classes implements Command Interface, which specifies the commands needed to perform the docking maneuver. In 2 every operation node class inherits from the abstract class Operation, which specifies the path of the task along the chain
