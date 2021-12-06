import java.util.Scanner;

class Employee
{
        
        public static void main(String[] args)
        {
                Scanner reader = new Scanner(System.in);
                System.out.println("Enter id: ");
                int id = reader.nextInt();
                System.out.println("Enter name: ");
                String name = reader.next();
                System.out.println(name+" "+id);
                reader.close();
        }
}
                