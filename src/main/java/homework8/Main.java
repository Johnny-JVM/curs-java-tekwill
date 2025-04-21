package homework8;

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(15.0);

        double Area = myCircle.calculateArea();
        System.out.println("Радиус круглого круга: " + Area);
    }
}
