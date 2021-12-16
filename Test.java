/*Write a program to show method overriding for two different classes, one is
company an others are amazon and flipkart. Both of them contain the method
address which is defined in the company. Address method of both companies should
have its own address as well as the name of its CEO. Override the method and
invoke it through the main class.*/

class Company
{
       public void address()
       {
               System.out.println("Address method of parent class Company.");
       }
}

class Amazon extends Company
{
        @Override
        public void address()
        {
                System.out.println("Amazon Office address: Ambience Corporate Office Tower-2, Ambience Island, Sector 24, Gurugram, Delhi-122002");
                System.out.println("Amazon CEO: Mr. Rajesh Mehta\r\n");
        }
}

class Flipkart extends Company
{
        @Override
        public void address()
        {
                System.out.println("Flipkart Office Address: Embassy Tech Village Rd, Bellandur, Bengaluru, Karnataka-560103");
                System.out.println("Flipkart CEO: Ms. Malini Parekh");
        }
}

class Test
{
        public static void main(String[] args)
        {
                Amazon c1 = new Amazon();
                Flipkart c2 = new Flipkart();
                c1.address();
                c2.address();
        }
}