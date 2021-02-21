import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return this.b*this.b - 4*this.a*this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.pow(this.b*this.b - 4*this.a*this.c,0.5))/(2*this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.pow(this.b*this.b - 4*this.a*this.c,0.5))/(2*this.a);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        double delta = quadraticEquation.getDiscriminant();

        if (delta>0) {
            System.out.println("X1 = "+quadraticEquation.getRoot1());
            System.out.println("X2 = "+quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("X = "+quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}