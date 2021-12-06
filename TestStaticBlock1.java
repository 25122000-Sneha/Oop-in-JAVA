class StaticDemo
{
        static
        {
                int a = 50;
        }
        static
        {
                int b = 4*a;
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
                s.member(a, b);
        }
}
