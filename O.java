/* 
The design principle used in the provided code is the Open/Closed 
Principle(OCP). This code also illustrates the ISP.

The Open/Closed Principle states that software entities (classes, modules, 
functions, etc.) should be open for extension but closed for modification. 
In other words, you should be able to extend the behavior of a system 
without modifying its existing code.


*/
interface Shape {
    // when I am changing getArea() to double from float it is giving nosuchmethoderror exception in rectangle class and in line no. 65
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
    private float side;

    public Square (float side){
        this.side = side;
    }

    @Override
    public float getArea(){
        return side * side;
    }
}

class Circle implements Shape {
    private float radius;

    public Circle (float radius){
        this.radius = radius;
    }

    @Override
    public float getArea(){
        // this formula is wrong
        return radius * radius;
        // this formula is right
        // return Math.PI * radius * radius;
        // but getArea is of float type and it cannot convert float to double
    }
}

public class O {
    public static void main(String [] arg){
        Rectangle R = new Rectangle(4, 5);
        double rectangleArea = R.getArea();
        System.out.println("Area of Rectangle : " + rectangleArea);

        Square S = new Square(3);
        double SquareArea = S.getArea();
        System.out.println("Area of Square : "+ SquareArea);

        Circle C = new Circle(21);
        double circleArea = C.getArea();
        System.out.println("Area of Circle : "+circleArea);
    }
}
