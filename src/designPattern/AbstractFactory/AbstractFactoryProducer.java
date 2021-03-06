package src.designPattern.AbstractFactory;

import src.designPattern.AbstractFactory.Color.ColorFactory;
import src.designPattern.AbstractFactory.Shape.ShapeFactory;
import src.designPattern.AbstractFactory.Size.SizeFactory;

/**
 * Created by jaydatta on 8/23/16.
 */
public class AbstractFactoryProducer {

public static AbstractFactory getFactory(String factoryInstance){

    if(factoryInstance==null){
        return null;
    }
    else if (factoryInstance.equalsIgnoreCase("COLOR"))
        return new ColorFactory();
    else if (factoryInstance.equals("SHAPE"))
        return new ShapeFactory();
    else if (factoryInstance.equalsIgnoreCase("SIZE"))
        return new SizeFactory();

return null;
}

}
