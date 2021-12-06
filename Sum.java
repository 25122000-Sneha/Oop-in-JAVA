/*Create class sum and demonstrate constructor overloading py adding  two, three parameters. If someone passes no parameter the message will display Bucket is empty.*/
import java.util.Scanner;
class 	Sum
{
        Sum(int a, int b)
        {
                System.out.println("Sum = "+(int)(a+b));
        }
        Sum(int a, int b, int c)
        {
                System.out.println("Sum = "+(int)(a+b+c));
        }
        Sum()
        {
                System.out.println("Bucket is empty");
        }
        public static void main(String[] args)
        {
                Scanner reader = new Scanner(System.in);
                System.out.println("Enter 2 values: ");
                int x = reader.nextInt();
                int y = reader.nextInt();
                Sum s1 = new Sum(x, y);

                System.out.println("Enter 3 values: ");
                x = reader.nextInt();
                y = reader.nextInt();
                int z = reader.nextInt();
                Sum s2 = new Sum(x,y,z);
                
                System.out.println("No parameters ");
                Sum s3 = new Sum();
                reader.close();
        }
}
        