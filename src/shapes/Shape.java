package shapes;

abstract class Shape {
    public String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract String getName();

    public void printName() {
        System.out.println("Фігура: " + getName());
    }
}
