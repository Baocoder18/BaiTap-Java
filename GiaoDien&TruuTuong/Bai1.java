interface Shape{
    public void getArea();
    public void getPerimeter();
}
class Square implements Shape {
    private double side;

    public Square(double side){
        this.side = side;
    }
    public void getArea(){
        System.out.println("Square Area: " + (side * side));
    }
    public void getPerimeter(){
        System.out.println("Square Perimeter: " + (side * 4));
    }
}
class Round implements Shape {
    private double radius;

    public Round(double radius){
        this.radius = radius;
    }
    public void getArea(){
        System.out.println("Round Area: " + (radius * radius * 3.14)); 
    }
    public void getPerimeter(){
        System.out.println("Round Perimeter: " + (2 * radius * 3.14));
    }
    public void setPerimeter(double radius){
        this.radius = radius;
    }
}
public class Bai1 {
    public static void main(String[] args) {
        Round r = new Round(3);
        r.getArea();
        r.getPerimeter();
        Square s = new Square(2);
        s.getArea();
        s.getPerimeter();
    }
}
