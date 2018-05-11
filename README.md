# 阅读Head First Design Pattern 代码
## Strategy Pattern
### Sim duck
## Observer Pattern
### Weather station
## Factory Pattern
### Simple Factory Pattern
The Simple Factory isn't actually a Design Pattern; it's more of a programming idiom.
But it is commonly used, so we'll give it a Head First Pattern Honorable Mention.
Some developers do mistake this idiom for the "Factory Pattern", so the next time there is an awkward silence between you and another developer, you've got a nice
topic to break the ice.

### Factory Method Pattern
**It's finallly time to meet the Factory Method Patter**
All Factory patterns encapsulate object creation. The Factory Method Pattern encapsulates object creation by letting subclass decide what objects to create.

#### Factory Method Pattern defined
It's time to roll out the official definition of the Factory Method Pattern:
> **The Factory Method Patter** defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

As with every factory,the Factory Method Pattern gives us a way to encapsulate the instantiations of concrete types. Looking at the class diagram belows,you can see that the abstract Creator gives you an interface with a method for creating object, also known as the "factory method." Any other methods implemented in the abstract Creator are written to operate on products produced by the factory method. Only subclasses actually implement the factory methods and create products. 

As in the office definition, you'll often hear developers say that the Factory Method lets subclasses decide which class to instantiate. They say "decides" not because the pattern allows subclasses themselves to decide at runtime, but because the creator class is written without knowledge of the actual products that will be created, which is decided purely by the choice of the subclass that is used.

#### The Dependency Inversion Principle

It should be pretty clear that reducing dependencies to 
concrete classes in our code is a "good thing." In fact, we've
got an OO design principle that formalizes this notion; it even 
has a big, fornam name: Dependency Iversion Principle.
> **Design Principle**
> Depend upon abstractions. Do not depend upon concrete classes.

At first, this principle sounds a lot like "Program to an interface, not an implementation," right? It is similar; however, the Dependency Inversion Prriciple makes an even stronger statement about abstraction. It suggests that our hig-level components should not depend on our low-level componects; rather, they should *both* depend on abstractions.

But what the heck does that mean?

Well, let's start by looking again at the pizza store diagram on the previous page. PizzaStore is our "high-level component" and the pizza implementations are our “low-component" and clearly the PizzaStore is dependent on the concrete pizza classes. 

Now, this principle tells us we should instead write our code so 
that we are depending on abstractions not concrete classes. That goes for both our high level modules and our low-level modules. 

But how do we do this ? Let's think about how we'd apply this principle to our Very Dependent PizzaStore implementation..

**Where's the "inversion" in Dependency Inversion Principle?**

The "inversion" in teh name Dependency Inversion Principle is there
because it inverts the way you typically might think about your OO design. Look at the diagram on the previous page, notice that the low-level components now depend on a higher level agstraction .
Likewise, the high-level component is also tied to the same abstraction. So, the top-tobottom dependency chart we drew a couple of pages back has inverted itself, with both high-level and low-level modules now depending on teh abstraction.

Let's also walk through the thinking behind the typical design process and see how introducing  the principle can invert the way we think about the design...
