package shapes;

class Test {
    public static void main(String[] args) {

        Circle circle1 = new Circle("Круг", 4.50);
        System.out.println("Периметр фігури " + circle1.getName() + ": " + circle1.perimeter()); //28.28
        System.out.println("Площа фігури " + circle1.getName() + ": " + circle1.square()); //63.62

        Quad quad1 = new Quad("Квадрат", 10.45);
        System.out.println("Периметр фігури " + quad1.getName() + ": " + quad1.perimeter()); //41.8
        System.out.println("Площа фігури " + quad1.getName() + ": " + quad1.square()); //109.21

        Triangle triangle1 = new Triangle("Трикутник", 3.6, 6.2, 7.4);
        System.out.println("Периметр фігури " + triangle1.getName() + ": " + triangle1.perimeter()); //17.2
        System.out.println("Площа фігури " + triangle1.getName() + ": " + triangle1.square()); //11.13

        Trapezoid trapezoid1 = new Trapezoid("Трапеція", 20, 40, 37);
        System.out.println("Периметр фігури " + trapezoid1.getName() + ": " + trapezoid1.perimeter()); //134
        System.out.println("Площа фігури " + trapezoid1.getName() + ": " + trapezoid1.square()); //1068.69

        Ellipse ellipse1 = new Ellipse("Еліпс", 10.4, 5.8);
        System.out.println("Периметр фігури " + ellipse1.getName() + ": " + ellipse1.perimeter()); //52.02
        System.out.println("Площа фігури " + ellipse1.getName() + ": " + ellipse1.square()); //189.5
    }
}
