package design.pattern;


interface Color {
    void getColorInfo();
}

class RedColor implements Color {

    @Override
    public void getColorInfo() {
        System.out.println("Red Color");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class PinkColor implements Color {

    @Override
    public void getColorInfo() {
        System.out.println("Pink Color");
    }
}

class BlueColor implements Color {

    @Override
    public void getColorInfo() {
        System.out.println("Blue Color");
    }
}

abstract class Shape {
    Color color;
    String shapeName;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public Shape(Color color, String shapeName) {
        this.color = color;
        this.shapeName = shapeName;
    }
}

class SquareShape extends Shape {

    public SquareShape(Color color, String shapeName) {
        super(color, shapeName);
    }

    @Override
    public String toString() {
        return "SquareShape{" +
                "color=" + color +
                ", shapeName='" + shapeName + '\'' +
                '}';
    }
}

class TriangleShape extends Shape {

    public TriangleShape(Color color, String shapeName) {
        super(color, shapeName);
    }

    @Override
    public String toString() {
        return "TriangleShape{" +
                "color=" + color +
                ", shapeName='" + shapeName + '\'' +
                '}';
    }
}

class RectangleShape extends Shape{

    public RectangleShape(Color color, String shapeName) {
        super(color, shapeName);
    }

    @Override
    public String toString() {
        return "RectangleShape{" +
                "color=" + color +
                ", shapeName='" + shapeName + '\'' +
                '}';
    }
}

public class BridgeDemo {

    public static void main(String[] args) {

        SquareShape blueSquare = new SquareShape(new BlueColor(),"Square");
        System.out.println(blueSquare);
        RectangleShape redRectangle =new RectangleShape(new RedColor(),"Rectangle");
        System.out.println(redRectangle);
        TriangleShape pinkTriangle = new TriangleShape(new PinkColor(),"Triangle");
        System.out.println(pinkTriangle);

    }

}
