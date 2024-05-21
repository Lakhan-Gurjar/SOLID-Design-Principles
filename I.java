/* 
The design principle used in the provided code is the Interface Segregation 
Principle (ISP). This code also illustrates OCP.

The Interface Segregation Principle states that clients should not be 
forced to depend on interfaces they do not use. It suggests that you 
should break down interfaces into smaller, specific ones so that classes 
implementing those interfaces are not forced to implement methods they 
don't need.

In the provided code:

The Shape interface declares a single method getArea(), which is a 
minimalistic approach to defining the behavior common to all shapes.
The Rectangle and Square classes implement the Shape interface, but they 
only provide implementations for the getArea() method, which is relevant 
to their respective shapes.
By adhering to the Interface Segregation Principle, the code ensures that 
each class implements only the methods it needs, keeping the interfaces 
cohesive and the classes focused on their specific responsibilities.
*/
interface Shape {
    float getArea();
}

class Rectangle implements Shape {
    private float length;
    private float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public float getArea() {
        return length * width ;
    }
}

class Square implements Shape {
    float side;

    public Square (float side){
        this.side = side;
    }

    @Override
    public float getArea(){
        return side * side;
    }
}

public class I {
    public static void main(String [] arg){
        Rectangle R = new Rectangle(4, 5);
        float rectangleArea = R.getArea();
        System.out.println("Area of Rectangle : " + rectangleArea);

        Square S = new Square(4);
        float SquareArea = S.getArea();
        System.out.println("Area of Square : "+ SquareArea);
    }
}