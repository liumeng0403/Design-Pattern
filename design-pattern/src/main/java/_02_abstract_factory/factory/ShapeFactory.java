package _02_abstract_factory.factory;

import _02_abstract_factory.abstracts.AbstractFactory;
import _02_abstract_factory.impls.shape.Circle;
import _02_abstract_factory.impls.shape.Rectangle;
import _02_abstract_factory.impls.shape.Square;
import _02_abstract_factory.interfaces.Color;
import _02_abstract_factory.interfaces.Shape;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if(shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
