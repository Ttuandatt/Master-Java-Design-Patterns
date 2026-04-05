# Factory Design Pattern Summary

## What is the Factory Design Pattern?

The Factory Design Pattern is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. This pattern uses factory methods to determine which class to instantiate, thereby decoupling the object creation process from its usage.

## How Does It Help/Benefits?

1. **Decoupling Object Creation from Usage**:
    - The Factory Design Pattern separates the responsibilities of object creation and object usage, making your code more modular and easier to manage.
    - Changes in the instantiation logic do not affect the client code that uses the objects.

2. **Encapsulation of Object Creation Logic**:
    - By encapsulating the object creation logic within a factory class, you can keep the client code simple and straightforward.
    - This also allows for better control over which implementation of an interface or abstract class is instantiated.

3. **Flexibility and Scalability**:
    - The Factory Design Pattern promotes flexibility by allowing different implementations to be created at runtime.
    - It supports scalability because adding new product types requires only the addition of a new factory method, without modifying existing client code.

4. **Improved Testability**:
    - Since object creation is abstracted behind a factory class, it becomes easier to create mock objects for testing purposes.
    - This improves the testability of your code by allowing you to isolate the component under test from its dependencies.

5. **Maintainability**:
    - By centralizing object creation logic in one place, the Factory Design Pattern makes your codebase easier to maintain and understand.
    - It reduces the risk of errors related to object instantiation and ensures consistency across the application.

### Example Implementation

Here’s a simple example to illustrate the Factory Design Pattern in Java:

#### 1. Define an Interface

```java
public interface Shape {
   void draw();
}
```

#### 2. Create Concrete Implementations

```java
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}
```

#### 3. Create a Factory Class

```java
public class ShapeFactory {
    // Use getShape method to get object of type shape
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
```

#### 4. Use the Factory

```java
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Get an object of Square and call its draw method.
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
    }
}
```

### Summary

The Factory Design Pattern is a powerful design pattern that promotes loose coupling, flexibility, and scalability. By encapsulating the creation logic within a factory class, it decouples object creation from usage, making your code easier to manage and test.

If you have any specific questions or need further details on how to implement the Factory Design Pattern in your project, feel free to ask!

### How to Run the Code

To run the example code:

1. Save the `Shape.java`, `Circle.java`, `Square.java`, `ShapeFactory.java`, and `FactoryPatternDemo.java` files in the appropriate directories.
2. Compile the Java files using a Java compiler (e.g., `javac Shape.java Circle.java Square.java ShapeFactory.java FactoryPatternDemo.java`).
3. Run the compiled classes using the Java interpreter (e.g., `java FactoryPatternDemo`).

This will output:

```
Drawing a circle
Drawing a square