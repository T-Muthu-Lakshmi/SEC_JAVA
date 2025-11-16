import java.util.Scanner;

public class CylinderSurVol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cylinder c = new Cylinder();

        // Input radius
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
        c.setRadius(r);

        // Input height
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        c.setHeight(h);

        // Calculations
        double surfaceArea = 2 * Math.PI * c.getRadius() * (c.getHeight() + c.getRadius());
        double volume = Math.PI * c.getRadius() * c.getRadius() * c.getHeight();

        // Output
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);

        sc.close();
    }
}
