/*Create a class called shape which has members called calarea() and display(). Calculate the area for three different shapes: triangle (scalene triangle), rectangle and circle. Apply method overloading to control the area parameter and display the area through main.*/
import java.util.Scanner;

class Shape1
{
        double calarea(double a, double b, double c)
        {
                double s = (a+b+c)/2;
                double Area = (Math.sqrt(s*(s-a)*(s-b)*(s-c)));
                return Area;
                
        }
        double calarea(double l, double b)
        {
                double Area = l*b;
                return Area;
        }
        double calarea(double r)
        {
                double Area =  Math.PI*r*r;
                return Area;
        }
        void display(double area)
        {
                System.out.println("Area: "+area+" sq. units");
        }
        public static void main(String[] args)
        {
                Shape1 s1 = new Shape1();
                Scanner reader = new Scanner(System.in);
                System.out.println("Enter length of 1st side of triangle: ");
                double a = reader.nextDouble();
                System.out.println("Enter length of 2nd side of triangle: ");
                double b = reader.nextDouble();
                System.out.println("Enter length of 3rd side of triangle: ");
                double c = reader.nextDouble();

                double area = s1.calarea(a,b,c);
                s1.display(area);

                System.out.println("Enter length of rectangle: ");
                double length = reader.nextDouble();
                System.out.println("Enter breadth of rectangle: ");
                double breadth = reader.nextDouble();

                area = s1.calarea(length, breadth);
                s1.display(area);

                System.out.println("Enter radius of circle: ");
                double r = reader.nextDouble();
                
                area = s1.calarea(r);
                s1.display(area);

                reader.close();
        }
}