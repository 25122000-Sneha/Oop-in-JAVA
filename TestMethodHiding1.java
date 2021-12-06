//Write a program to demonstrate method hiding
class Parent
{
        static void method1()
        {
                System.out.println("Static method in Parent class is called.");
        }
        void method2()
        {
                System.out.println("Non-static method in Parent class is called.");
        }
}

class Child extends Parent
{
        static void method1()
        {
                System.out.println("Static method in Child class is called.");
        }
        void method2()
        {
                System.out.println("Non-static method in Child class is called.");
        }
}

class TestMethodHiding1
{
        public static void main(String[] args)
        {
                Parent d1 = new Parent();
                Parent d2 = new Child();
                //method hiding(uses reference)
                d1.method1();                                     //executes method1 in Parent class             
                d2.method1();                                     //executes method1 in Parent class
                //method overloading(uses runtime object)
                d1.method2();                                     //executes method2 in Parent class
                d2.method2();                                     //executes method2 in Child class
        }
}