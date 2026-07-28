package application;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    rectangle rectangle = new rectangle();
	    
	    System.out.println("Digite a base do retangulo: ");
	    rectangle.width = sc.nextDouble();
	    
	    System.out.println("Digite a altura do retangulo: ");
	    rectangle.height = sc.nextDouble();
	    
	    System.out.println("AREA: " + rectangle.area(rectangle.widht, rectangle.height));
	    System.out.println("PERIMETER: " + rectangle.perimeter(rectangle.widht, rectangle.height));
	    System.out.println("DIAGONAL: " + rectangle.diagonal(rectangle.widht, rectangle.height));
	}
}

public class rectangle {
    
    double width, height;
    
    double area = width/height;
    double perimeter = (width+height) * 2;
    double diagonal = Math.sqrt(Math.pow(widht, 2) + Math.pow(height, 2));
    
}
