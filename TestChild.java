import java.util.Scanner;
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
                System.out.println("Mother's name: "+mother);
                System.out.println("Father's name: "+father);
        }
}

class Child extends Parent
{
        String name;
        Child(String n, String mo, String fa){
                super(mo, fa);
                name = n;
        }
        public void show()
        {
                System.out.println("Child's name: "+name);
                System.out.println("Mother's name: "+mother);
                System.out.println("Father's name: "+father);
        }
}

class TestChild{
        public static void main(String[] args){
                Scanner reader = new Scanner(System.in);
                System.out.println("Enter child name: ");
                String child_name = reader.next();
                System.out.println("Enter mother's name: ");
                String mother_name = reader.next();
                System.out.println("Enter father's name: ");
                String father_name = reader.next();
                Child c = new Child(child_name, mother_name, father_name);
                c.show();
                reader.close();
        }
}