public class Circle extends Shape implements Resizeable{
    double a;
    public Circle() {
    }

    public Circle(double radius) {
        this.setRadius(radius);
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.setRadius(radius);
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public double getPerimeter() {
        return 2 * getRadius() * Math.PI;
    }

    public void resize(double percent) {
        a = getArea()*percent;
    }

    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}

