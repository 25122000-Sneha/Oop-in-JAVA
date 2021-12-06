class Animal
{
        void eat()
        {
                System.out.println("Eating....");
        }
}

class Animal_1
{
        void drink()
        {
                System.out.println("Drinking....");
        }
}



class Dog extends Animal
{
        void bark()
        {
                System.out.println("Barking....");
        }
}

class TestInheritance
{
        public static void main(String[] args)
        {
               Dog d = new Dog();
               d.eat();
               d.bark();
               //d.drink();
        }
} 