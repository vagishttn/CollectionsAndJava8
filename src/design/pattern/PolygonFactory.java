package design.pattern;


interface Polygon {
    void getInfo();
}

class Square implements Polygon {

    @Override
    public void getInfo() {
        System.out.println("Square");
    }
}

class Rectangle implements Polygon {

    @Override
    public void getInfo() {
        System.out.println("Rectangle");
    }
}

class FactoryPolygon {
    static Polygon getPolygon(String name) {
        Polygon polygon = null;
        switch (name) {
            case "Square":
                polygon = new Square();
                break;
            case "Rectangle":
                polygon = new Rectangle();
                break;
        }
        return polygon;
    }
}

public class PolygonFactory {
    public static void main(String[] args) {
        Polygon square = FactoryPolygon.getPolygon("Square");
        square.getInfo();
        Polygon rectangle = FactoryPolygon.getPolygon("Rectangle");
        rectangle.getInfo();
    }
}
