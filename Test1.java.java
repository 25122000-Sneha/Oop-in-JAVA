class Parent
{
        String father;
        String mother;
        Parent(String m, String f)
        {
                mother = m;
                father = f;
        }
        public void show()
        {
                System.out.println(mother + " " + father);
        }
}

class Child extends Parent
{
        String name;
        Child(String n, String m, String f){
        name = n;
        mother = m;
        father = f;
        }
        public void show()
        {
                System.out.println(name + " " + mother + " " + father);
        }
}

class Test1{
        public static void main(String[] args){
                Child c = new Child("Karim", "Rita", "Rahul");
                c.show();
        }
}