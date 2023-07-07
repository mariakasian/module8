package shapes;

class Trapezoid extends Shape implements ShapePerimeter, ShapeSquare {
    private double sideUp;
    private double sideDown;
    private double sideLeft;

    public Trapezoid(String name, double sideUp, double sideDown, double sideLeft) {
        super(name);
        this.sideUp = sideUp;
        this.sideDown = sideDown;
        this.sideLeft = sideLeft;
    }

    public double getSideUp() {
        return sideUp;
    }

    public double getSideDown() {
        return sideDown;
    }

    public double getSideLeft() {
        return sideLeft;
    }

    @Override
    public double perimeter() {
        double p;
        p = Math.ceil((2 * getSideLeft() + getSideUp() + getSideDown()) * 100) /100;
        return p;
    }

    @Override
    public double square() {
        double s;
        double h = Math.sqrt(Math.pow(getSideLeft(), 2) - (Math.pow((getSideDown() - getSideUp()), 2)) / 4);
        s = Math.ceil(((getSideUp() + getSideDown()) * h / 2) * 100) / 100;
        return s;
    }
}
