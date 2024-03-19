import java.sql.SQLOutput;

public class Main {
    public static void main(String [] args) {
        Rectangle Rectangulo1 = new Rectangle(4,3);
        System.out.println("The rectangle has been created");

        Double Area = Rectangulo1.getArea();
        System.out.println("The area of rectangle is: " + Area);

        Double Perimeter =  Rectangulo1.getPerimeter();
        System.out.println("The perimeter of rectangle is: " + Perimeter);

        Rectangulo1.resize(3);
        System.out.println("----------------------------");

        Area = Rectangulo1.getArea();
        System.out.println("The new area of rectangle is: " + Area);

        Perimeter = Rectangulo1.getPerimeter();
        System.out.println("The new perimeter of rectangle is: " + Perimeter);

        Triangle Triangulo1 = new Triangle(5,3);
    }
}
interface Resizable {
    public void resize(double value);
}
abstract class Figure{
    private int numberOfSides;

    Figure(int numberOfSides){
        this.numberOfSides = numberOfSides;
    }
    public int getNumberOfSides() {
        return numberOfSides;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
class Rectangle extends Figure implements Resizable {
    private double width;
    private double high;

    Rectangle(double width, double high) {
        super(4);
        this.width = width;
        this.high = high;
    }

    @Override
    public double getArea() {
        return width * high;
    }
    @Override
    public double getPerimeter() {
        return (width * 2) + (high * 2);
    }

    @Override
    public void resize(double value){
        this.width = width * value;
        this.high = high * value;
    }
}
class Triangle extends Figure {
    private double width;
    private double high;

    Triangle(double width, double high) {
        super(3);
        this.width = width;
        this.high = high;
    }
    @Override
    public double getArea(){
        return (width * high) / 2;
    }
    @Override
    public double getPerimeter() {
        return width + high + high;
    }
}