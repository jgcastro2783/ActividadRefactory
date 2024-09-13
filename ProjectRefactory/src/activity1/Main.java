package activity1;

import java.util.Scanner;

/*1 crear una interfaz para las distintas figuras*/
interface Shape{
	double  calculateArea();
	double calculatePerimeter();
}

//implementacion para el rectangulo

class Rectangle implements Shape{
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width=width;
		this.height=height;
	}
	
	@Override
    public double calculateArea() {
        return width * height;
    }
	
	@Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
	
	
}

//Implementación para el Círculo
class Circle implements Shape {
 private int radius;

 public Circle(int radius) {
     this.radius = radius;
 }

 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }

 @Override
 public double calculatePerimeter() {
     return 2 * Math.PI * radius;
 }
}

//Implementación para el Triángulo
class Triangle implements Shape {
 private int base;
 private int height;

 public Triangle(int base, int height) {
     this.base = base;
     this.height = height;
 }

 @Override
 public double calculateArea() {
     return 0.5 * base * height;
 }

 @Override
 public double calculatePerimeter() {
     // Asumiendo un triángulo equilátero para simplicidad
     return 3 * base;
 }
}

//Implementación para el Cuadrado
class Square implements Shape {
 private int side;

 public Square(int side) {
     this.side = side;
 }

 @Override
 public double calculateArea() {
     return side * side;
 }

 @Override
 public double calculatePerimeter() {
     return 4 * side;
 }
}

//Implementación para la Esfera
class Sphere implements Shape {
 private int radius;

 public Sphere(int radius) {
     this.radius = radius;
 }

 @Override
 public double calculateArea() {
     return 4 * Math.PI * radius * radius;
 }

 @Override
 public double calculatePerimeter() {
     // La esfera no tiene perímetro, retornamos 0
     return 0;
 }
}

//Implementación para el Cubo
class Cube implements Shape {
 private int side;

 public Cube(int side) {
     this.side = side;
 }

 @Override
 public double calculateArea() {
     return 6 * side * side;
 }

 @Override
 public double calculatePerimeter() {
     // El cubo no tiene perímetro, retornamos 0
     return 0;
 }
}

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
            System.out.println("6. Sube");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            option = Integer.parseInt(sc.nextLine());
            
            Shape shape = null;
                 
            
            switch(option){
                case 1: {
                  
                    System.out.print("Inserte el Ancho: ");
                    int width = Integer.parseInt(sc.nextLine());
                    System.out.print("Inserte el largo: ");
                    int heigth = Integer.parseInt(sc.nextLine());
                    shape=new Rectangle(width,heigth);
                    break;
                }
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


