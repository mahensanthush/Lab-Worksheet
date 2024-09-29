import java.util.Scanner;

public class CircularRegion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the radius of the inner circle (ri): ");
        double ri = scanner.nextDouble();

        System.out.print("Enter the radius of the outer circle (ro): ");
        double ro = scanner.nextDouble();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double areaInner = innerCircle.computeArea();
        double areaOuter = outerCircle.computeArea();

        
        double shadedArea = areaOuter - areaInner;

     
        System.out.println("The area of the circular region (shaded area) is: " + shadedArea);
    }
}
