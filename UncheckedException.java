//Unchecked exceptions are checked at runtime.
class UncheckedException
{
        public static void main(String[] args)
        {
                int a = 0;
                int b = 5;
                int c = b/a;
                System.out.println("Result is "+c);
        }
}