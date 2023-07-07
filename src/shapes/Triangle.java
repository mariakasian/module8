package shapes;

class Triangle extends Shape implements ShapePerimeter, ShapeSquare {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    public double perimeter() {
        double p;
        p = Math.ceil((getSideA() + getSideB() + getSideC()) * 100) / 100;
        return p;
    }

    @Override
    public double square() {
        double s;
        double d = (getSideA() + getSideB() + getSideC()) / 2;
        s = Math.ceil(Math.sqrt(d * (d - getSideA()) * (d - getSideB()) * (d - getSideC())) * 100) / 100;
        return s;
    }
}
