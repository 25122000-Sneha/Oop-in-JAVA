import java.util.Scanner;
class NestedTry
{
     public static void main(String[] args)
     {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = reader.nextInt();
        try
        {
                int b = 100/a;
                System.out.println("The value of b is "+b);
     
                try
                {
                        try
                        {
                                int arr[] = {2, 4, 9, 8, 5};
                                System.out.println("Element is "+arr[5]);
                        }
                        catch (StringIndexOutOfBoundsException e)
                        {
                                System.out.println("String index out-of-bounds: "+e);
                        }
                }
                catch (ArrayIndexOutOfBoundsException e)
                {
                        System.out.println("Array index out-of-bounds: "+e);
                }
        }
        catch(ArithmeticException e) 
        {
                System.out.println("Division by 0: "+e);
        }
        finally           //always gets executed
        {
                System.out.println("The finally block always gets executed no matter whether exception occurs or not.");
        }
        System.out.println("Out of main try-catch block.");
        
     }
}