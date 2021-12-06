import java.util.Scanner;

public class FullName {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = reader.next();
        System.out.println("Enter your last name: ");
        String lastName = reader.next();

        System.out.println("Your full name is "+firstName + " " + lastName);
        reader.close();
    }
}
