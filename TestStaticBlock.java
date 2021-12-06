/*Create a static block and show that it is going to be called before the main() method.*/
class TestStaticBlock
{
        
        public static void main(String[] args)
        {
                System.out.println("Main is invoked.");
        }
        static
        {
                System.out.println("Static block has been invoked.");
        }
}