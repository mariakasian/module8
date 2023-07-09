package shapes;

class Ellipse extends Shape implements ShapePerimeter, ShapeSquare {
    private double radiusBig;
    private double radiusSmall;

    public Ellipse(String name, double radiusBig, double radiusSmall) {
        super(name);
        this.radiusBig = radiusBig;
        this.radiusSmall = radiusSmall;
    }

    public double getRadiusBig() {
        return radiusBig;
    }

    public double getRadiusSmall() {
        return radiusSmall;
    }

    @Override
    public double perimeter() {
        double p;
        p = Math.ceil((4 * (Math.PI* getRadiusBig() * getRadiusSmall() + Math.pow((getRadiusBig() - getRadiusSmall()), 2)) /
                (getRadiusBig() + getRadiusSmall())) * 100) / 100;
        return p;
    }

    @Override
    public double square() {
        double s;
        s = Math.ceil(Math.PI * getRadiusBig() * getRadiusSmall() * 100) / 100;
        return s;
    }

    @Override
    String getName() {
        return "Еліпс";
    }
}
