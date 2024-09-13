package actCalculatorShape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        System.out.println("----------Calculate area of shapes-----------");

        while (option != 7) {
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Square");
            System.out.println("5. Sphere");
            System.out.println("6. Cube");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            option = Integer.parseInt(sc.nextLine());

            Shape shape = null;

            switch (option) {
                case 1:
                    System.out.print("Insert width: ");
                    int width = Integer.parseInt(sc.nextLine());
                    System.out.print("Insert height: ");
                    int height = Integer.parseInt(sc.nextLine());
                    shape = new Rectangle(width, height);
                    break;

                case 2:
                    System.out.print("Insert radius: ");
                    int radius = Integer.parseInt(sc.nextLine());
                    shape = new Circle(radius);
                    break;

                case 3:
                    System.out.print("Insert base: ");
                    int base = Integer.parseInt(sc.nextLine());
                    System.out.print("Insert height: ");
                    int triHeight = Integer.parseInt(sc.nextLine());
                    shape = new Triangle(base, triHeight);
                    break;

                case 4:
                    System.out.print("Insert side: ");
                    int side = Integer.parseInt(sc.nextLine());
                    shape = new Square(side);
                    break;

                case 5:
                    System.out.print("Insert radius: ");
                    int sphereRadius = Integer.parseInt(sc.nextLine());
                    shape = new Sphere(sphereRadius);
                    break;

                case 6:
                    System.out.print("Insert side: ");
                    int cubeSide = Integer.parseInt(sc.nextLine());
                    shape = new Cube(cubeSide);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option.");
                    break;
            }

            if (shape != null) {
                System.out.println("Area: " + shape.calculateArea());
                System.out.println("Perimeter: " + shape.calculatePerimeter());
            }
        }

        sc.close();
    }
}