package shapes;

public class Rectangle extends Shape{
    private double width;

    @Override
    public void calculateArea(){
        System.out.println(this.getSide() * this.width );
    }

    @Override
    public void printSide(Shape shape) {
        System.out.println("print side  of rectangle" + this.getSide());

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
