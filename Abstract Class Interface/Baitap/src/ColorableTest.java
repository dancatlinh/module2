public class ColorableTest {
    public static void main(String[] args) {
        Square square = new Square();
        Circle circle = new Circle();
        Shape[] shape = { new Circle(), new Square()};

        for (int j = 0; j<shape.length; j++) {
            if (shape[j] instanceof Colorable) {
                square.howToColor();
            }
        }
    }
}
