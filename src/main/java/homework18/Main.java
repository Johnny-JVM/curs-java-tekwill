package homework18;

public class Main extends Square {
    static void PrintGeometry(Circle a) {
a.print();
    }

    public static void main(String[] args) {
        Polygon polygon = new Polygon();
        Square square = new Square();
        Circle circle = new Circle();

        PrintGeometry(polygon);
        PrintGeometry(square);
        PrintGeometry(circle);
    }
}
