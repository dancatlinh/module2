public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shape = { new Circle(3.5, "red", false), new Square()};

        for (int j = 0; j<shape.length; j++) {
            if (shape[j] instanceof Colorable) {
                ((Colorable) shape[j]).howToColor();
            } else {
                System.out.println(((Circle) shape[j]).getArea());
            }
        }
    }
}
