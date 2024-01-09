import java.util.Scanner;

public class Exercise3 {
    public static double perimeterRectangle(double side1, double side2) {
        return 2 * (side1 + side2);
    }
    public static int evenOdd(int number) {
        return (number % 2 == 0) ? 0 : 1;
    }
    public static double perimeterTriangle(double side1, double side2, double side3) {
        return  side1 + side2 + side3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of side 1 of the rectangle: ");
        double rectangleSide1 = scanner.nextDouble();
        System.out.println("Enter the length of side 2 of the rectangle: ");
        double rectangleSide2 = scanner.nextDouble();
        double rectanglePerimeter = perimeterRectangle(rectangleSide1, rectangleSide2);
        System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);

        System.out.println("Enter an integer: ");
        int inputNumber = scanner.nextInt();
        int resultEvenOdd = evenOdd(inputNumber);
        System.out.println("Result of evenOdd: " + resultEvenOdd);

        System.out.println("Enter the length of side 1 of the triangle: ");
        double triangleSide1 = scanner.nextDouble();
        System.out.println("Enter the length of side 2 of the triangle: ");
        double triangleSide2 = scanner.nextDouble();
        System.out.println("Enter the length of side 3 of the triangle: ");
        double triangleSide3 = scanner.nextDouble();
        double trianglePerimeter = perimeterTriangle(triangleSide1, triangleSide2, triangleSide3);
        System.out.println("Perimeter of the triangle: " + trianglePerimeter);

        scanner.close();
    }
}
