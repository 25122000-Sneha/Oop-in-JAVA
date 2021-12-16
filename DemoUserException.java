import java.util.Scanner;
class MyException extends Exception
{
        MyException(String str)
        {
                super(str);
        }
}

class TestUserException
{
        public static void isEligible(int age) throws MyException
        {
                if(age > 5)
                {
                        throw new MyException("Not Eligible for admission to pre-primary classes");
                }
                else
                {
                        System.out.println("Eligible for admission to pre-primary department.");
                }
        }
}


class DemoUserException
{
        public static void main(String[] args)
        {
                Scanner reader = new Scanner(System.in);
                System.out.println("Enter age of candidate: ");
                int studentAge = reader.nextInt();
                try
                {
                        TestUserException.isEligible(studentAge);
                }
                catch (MyException e)
                {
                       System.out.println("Caught "+e);
                }
        }
} 

