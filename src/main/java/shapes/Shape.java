package shapes;

import java.util.Scanner;

public abstract class Shape {
    private double side;

    public void calculateArea(){

        System.out.println("calculating area of shape");
    }

    public double getSide() {

        return side;
    }

    public void setSide(double side) {

        this.side = side;
    }

//    public static void printSideArray(Shape[] anArrayOfShapeObjects){
//        for(int x = 0; x < anArrayOfShapeObjects.length; x++){
//            System.out.println(anArrayOfShapeObjects[x].side);
//        }




    //overloaded method
//        public static void printSide(Shape shape){
//            System.out.println(shape.side);
//        }
    public abstract void printSide(Shape shape);


    }




}
