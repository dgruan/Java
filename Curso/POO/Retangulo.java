package application;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    rectangle rectangle = new rectangle();
	    
	    System.out.println("Digite a base do retangulo: ");
	    rectangle.width = nextDouble();
	    
	    System.out.println("Digite a altura do retangulo: ");
	    rectangle.height = nextDouble();
	    
	    System.out.println("AREA: " + rectangle.area);
	    System.out.println("PERIMETER: " + rectangle.perimeter);
	    System.out.println("DIAGONAL: " + rectangle.diagonal);
	}
}

public class rectangle {
    
    double width, height;
    double area, perimeter, diagonal;
    
    area = width/height;
    perimeter = (width+height) * 2;
    diagonal = Math.sqrt(Math.pow(widht, 2) + Math.pow(height, 2));
    
}
