# 阅读Head First Design Pattern 代码
## Design Toolbox
### OO Basic
### OO Principles
- Encapsulate what varies.
- Favor composition over inheritance.
- Program to interface not implementations.
- Strive for loosely coupled designs between objects that interact
- Classes should be open for extensions but closed for modification
- Depend on abstractions. Do not depend on concrete classes.
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
**It's finally time to meet the Factory Method Patter**
All Factory patterns encapsulate object creation. The Factory Method Pattern encapsulates object creation by letting subclass decide what objects to create.

#### Factory Method Pattern defined
It's time to roll out the official definition of the Factory Method Pattern:
> **The Factory Method Patter** defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

As with every factory,the Factory Method Pattern gives us a way to encapsulate the instantiations of concrete types. Looking at the class diagram below,you can see that the abstract Creator gives you an interface with a method for creating object, also known as the "factory method." Any other methods implemented in the abstract Creator are written to operate on products produced by the factory method. Only subclasses actually implement the factory methods and create products. 

As in the office definition, you'll often hear developers say that the Factory Method lets subclasses decide which class to instantiate. They say "decides" not because the pattern allows subclasses themselves to decide at runtime, but because the creator class is written without knowledge of the actual products that will be created, which is decided purely by the choice of the subclass that is used.

#### The Dependency Inversion Principle

It should be pretty clear that reducing dependencies to 
concrete classes in our code is a "good thing." In fact, we've
got an OO design principle that formalizes this notion; it even 
has a big, form name: Dependency Inversion Principle.
> **Design Principle**
> Depend upon abstractions. Do not depend upon concrete classes.

At first, this principle sounds a lot like "Program to an interface, not an implementation," right? It is similar; however, the Dependency Inversion Principle makes an even stronger statement about abstraction. It suggests that our high-level components should not depend on our low-level components; rather, they should *both* depend on abstractions.

But what the heck does that mean?

Well, let's start by looking again at the pizza store diagram on the previous page. PizzaStore is our "high-level component" and the pizza implementations are our “low-component" and clearly the PizzaStore is dependent on the concrete pizza classes. 

Now, this principle tells us we should instead write our code so 
that we are depending on abstractions not concrete classes. That goes for both our high level modules and our low-level modules. 

But how do we do this ? Let's think about how we'd apply this principle to our Very Dependent PizzaStore implementation..

**Where's the "inversion" in Dependency Inversion Principle?**

The "inversion" in the name Dependency Inversion Principle is there
because it inverts the way you typically might think about your OO design. Look at the diagram on the previous page, notice that the low-level components now depend on a higher level abstraction .
Likewise, the high-level component is also tied to the same abstraction. So, the top-to bottom dependency chart we drew a couple of pages back has inverted itself, with both high-level and low-level modules now depending on the abstraction.

Let's also walk through the thinking behind the typical design process and see how introducing  the principle can invert the way we think about the design...

### Abstract Factory Pattern
The Pizza cod used the factory it has been composed with to produce the ingredients used in the pizza. The ingredients produced depend on which factory we're using. The Pizza class doesn't care; it knows how to make pizzas. Now, it's decoupled from the differences in regional ingredients and can be easily reused when there are factories for the Rockies, the Pacific Northwest, and beyond. 

```java
sauce = ingredientFactory.createSauce();
```
**What have we done?**
We provided a means of creating a family of ingredient for pizzas by introducing a new type of factory called an Abstract Factory.

An Abstract Factory gives us an interface for creating a family of products. By writing code that uses this interface, we decouple our code from the actual factory that creates the products . That allows us to implement a variety of factories that produce products meant for different contexts - such as different regions, different operating system, or different look and feels.

Because our code is decoupled from the actual products, we can substitute different factories to get different behaviors (like getting marinara instead of plum tomatoes).

**Abstract Factory Pattern defined**
We're adding yet another factory pattern to our pattern family, one that lets us create families of products. Let's check out the official definition for this pattern:
> **The Abstract Factory Pattern** provides an interface for creating families of related or dependent objects without specifying concrete classes.

We've certainly seen that Abstract Factory allows a client to use an abstract interface to create a set of related products without knowing (or caring) about the concrete products that are actually produced. Let's look at the class diagram to see how this all holds together:

### The different between Factory Method and Abstract Factory

- Both Abstract Factory and Factory Method create objects, but Factory Method through inheritance and Abstract Method through object composition.
- In Factory Method , clients only need to know the abstract type they are using, the subclass worries about the concrete type. In other words, Factory keep clients decoupled from the concrete types.
- Abstract Factory provide an abstract type for creating  a family of products. Subclasses of this type define how those products are produced. To use the factory, you instantiate one and pass it into some code that is written against the abstract type. So, like Factory Method, clients are decoupled from the actual concrete products they use.

### BULLET POINTS
- All factories encapsulate object creation.
- Simple Factory, while not a bona fide design pattern. is a simple way to decouple your clients from concrete objects.
- Factory Method relies on inheritance: object creation is delegated to subclasses which implement the factory method to create objects.
- Abstract Factory relies on object composition: object creation is implemented in methods exposed in the factory interface.
- All factory patterns promote loose coupling by reducing the dependency of your application on concrete classes.
- The intent of Factory Method is to allow a class to defer instantiation to its subclasses.
- The intent of Abstract Factory is to create families of related objects without having to depend on their concrete classes.
- The Dependency Inversion Principle guides us to avoid dependencies on concrete types and to strive for abstractions.
- Factories are a powerful technique for coding to abstractions, not concrete classes.
