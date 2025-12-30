A.
A Java console application that models different types of vehicles using Object-Oriented Programming. The system demonstrates abstraction, inheritance, polymorphism and composition, and aggregation, including a bonus example of multi-level inheritance.
Inheritance is used to create a common `Vehicle` superclass with specialized subclasses (`Car`, `Motorcycle`, `Truck`, `ElectricCar`).
Abstraction is applied through the abstract `Vehicle` class, defining shared structure and required behaviors.
Composition and aggregation are shown by associating a `Driver` with vehicles, allowing drivers to exist independently and be shared.


B.
Vehicle is an abstract superclass that defines common fields brand year and driver and declares the abstract methods startEngine and stopEngine

Car Motorcycle and Truck extend Vehicle and provide their own implementations of engine behavior
ElectricCar extends Car demonstrating multi level inheritance

All subclasses override startEngine and stopEngine to define vehicle specific behavior and support polymorphism

Access modifiers are used as follows private is used for encapsulation of class specific fields protected is used in Vehicle to allow subclass access and public is used for constructors and methods accessed from Main

C.Instructions to Compile and Run Open Intellij, add this project and go to the main class, then click the run button.
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-
-
-
-
---D.Program Output ![output](https://github.com/user-attachments/assets/20a4ea29-1b83-49b4-bd07-a91169f6a5bf)
---Project Structure  ![structure](https://github.com/user-attachments/assets/1d80fab6-95b3-48b0-b4d0-0c44170bd0e0)
---UML diagram  ![UML diagram](https://github.com/user-attachments/assets/05ee7abf-bfa2-491b-a3eb-cc1a36871b6e)

E.Inheritance made the project easier because all vehicles share the same base class Vehicle. Common fields and methods were written once, so I did not repeat the same code in every class. When I added new vehicles like ElectricCar, I could reuse existing code and only add what was different.
Method overriding helped each vehicle act in its own way, for example starting and stopping the engine differently. Using protected and default access modifiers was a bit challenging because I had to understand what subclasses can access and what should stay hidden. It helped me learn how to protect data while still allowing inheritance to work correctly.




