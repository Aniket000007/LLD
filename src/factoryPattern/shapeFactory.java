package factoryPattern;

public class shapeFactory {

    shape shape;

    public shape getshape(String shap){
        switch(shap){
            case "CIRCLE":
                shape = new circle();
                return shape;
            case "RECTANGLE":
                shape = new rectangle();
                return shape;
            default:
                return null;
        }
    }
}
