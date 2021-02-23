public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        double[] arr = {circle.getArea(), rectangle.getArea()};

        System.out.println("Pre-resize: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        circle.resize(1 + (int)(Math.random() * ((100 - 1) + 1)));
        rectangle.resize(1 + (int)(Math.random() * ((100 - 1) + 1)));
        arr[0] = circle.a;
        arr[1] = rectangle.b;


        System.out.println("After-resize:");
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


