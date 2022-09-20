package shapes;
//calculating the area of circle PI * R * R
public class Circle extends Shape {

    @Override
    public void calculateArea() {
        System.out.println(Math.PI * this.getSide() * this.getSide());


    }

    @Override
    public void printSide(Shape shape) {
        System.out.println("Print side of circle" + this.getSide());
    }
}
