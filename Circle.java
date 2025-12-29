interface Shape {
    void area();
}

class Circle implements Shape {
    double radius;
    Circle(double r) { radius = r; }

    public void area() {
        System.out.println("Area: " + (3.14 * radius * radius));
    }

    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.area();
    }
}
