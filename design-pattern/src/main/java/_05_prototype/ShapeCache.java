package _05_prototype;

import _05_prototype.abstracts.Shape;
import _05_prototype.impls.Circle;
import _05_prototype.impls.Rectangle;
import _05_prototype.impls.Square;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {

    public static Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId){
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }

}
