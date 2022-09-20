package shapes;

public class ShapeFactory {

    public static void printAreaOfShape(Shape[] shapes){
        for(int x = 0; x < shapes.length; x++){
            shapes[x].calculateArea();
        }
    }
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        circle.setSide(7);
        //circle.printSide();

        Rectangle rectangle = new Rectangle();
        rectangle.setSide(10);
        rectangle.setWidth(20);
        //rectangle.calculateArea();

        Triangle triangle = new Triangle();

        //Shape[] anArrayOfShapeObjects = new Shape[] {circle, rectangle};
        //printAreaOfShape(anArrayOfShapeObjects);
        //Shape.printSide(anArrayOfShapeObjects);

        // create a method that takes shapes and prints out the area of shapes
    }
}
