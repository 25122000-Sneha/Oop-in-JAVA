class StaticDemo
{
        static int a, b;
        static
        {
                System.out.println("1st static block is invoked"); 
                a = 50;
        }
        static
        {
                System.out.println("2nd static block is invoked");
                b = 4*a;
        } 
        void member(int a, int b)
        {
                System.out.println("Value of a: "+a);
                System.out.println("Value of b: "+b);
        }
}

class TestStaticDemo
{
        public static void main(String[] args)
        {
                StaticDemo s = new StaticDemo();
                s.member(s.a, s.b);
        }
}
