package shapes;

class Circle extends Shape implements ShapePerimeter, ShapeSquare {
    private double radius;

    public Circle(String name, double radius) {
        super("Круг");
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double perimeter() {
        double p;
        p = Math.ceil(Math.PI * 2 * getRadius() * 100) / 100;
        return p;
    }

    @Override
    public double square() {
        double s;
        s = Math.ceil(Math.PI * getRadius() * getRadius() * 100) / 100;
        return s;
    }
}
