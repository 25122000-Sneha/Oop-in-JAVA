class HandleException
{
        public static void main(String[] args)
        {
                try {
                int a = 0;
                int b = 5;
                int c = b/a;
                System.out.println("Result is "+c);
                }
                catch(ArithmeticException e) {
                System.out.println("Division by 0 (zero): "+e);
                }
        }
}