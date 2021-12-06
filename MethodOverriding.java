class Company
{
       public void address()
       {
               System.out.println("I am in parent class Company.");
       }
}

class Amazon extends Company
{
        @Override
        public void address()
        {
                System.out.println("Amazon: Gurgaon");
                System.out.println("Amazon CEO: Mr. Rajesh Mehta");
        }
}

class Flipkart extends Company
{
        @Override
        public void address()
        {
                System.out.println("Flipkart: Nagpur");
                System.out.println("Flipkart CEO: Ms. Malini Parekh");
        }
}

class MethodOverriding
{
        public static void main(String[] args)
        {
                Amazon c1 = new Amazon();
                Flipkart c2 = new Flipkart();
                c1.address();
                c2.address();
        }
}