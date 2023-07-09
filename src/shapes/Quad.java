package shapes;

class Quad extends Shape implements ShapePerimeter, ShapeSquare {
    private double side;

    public Quad(String name, double side) {
        super(name);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double perimeter() {
        double p;
        p = Math.ceil(4 * getSide() * 100) / 100;
        return p;
    }

    @Override
    public double square() {
        double s;
        s = Math.ceil(getSide() * getSide() * 100) / 100;
        return s;
    }

    @Override
    String getName() {
        return "Квадрат";
    }
}
