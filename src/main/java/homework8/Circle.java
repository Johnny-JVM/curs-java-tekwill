package homework8;

public class Circle {
        double radius;

        public Circle(double r) {
            radius = r;
        }


        public double calculateArea() {
            return Math.PI * radius * radius;
        }
    }
