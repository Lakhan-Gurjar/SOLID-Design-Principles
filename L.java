/* 
The design principle used in the provided code is the Liskov Substitution
Principle (LSP).

This principle states that objects of a superclass should be replaceable 
with objects of its subclasses without affecting the correctness of the 
program.

If class B is subtype of class A, then we should be able to replace object 
of A with B without breaking the behaviour of the program.

*** subclass should extend the capability of parent class not narrow it down
*/

abstract class Shape {
    abstract double getArea();
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }
}

class Square extends Shape {
    double side;

    public Square (double side){
        this.side = side;
    }

    @Override
    double getArea(){
        return side * side;
    }
}

public class L {
    public static void main (){
        Rectangle R = new Rectangle(4, 5);
        double rectangleArea = R.getArea();
        System.out.println("Area of Rectangle : "+ rectangleArea);

        Square s = new Square(9);
        double SquareArea = s.getArea();
        System.out.println("Area of Square : "+ SquareArea);
    }
}
