import java.util.Scanner;
class Student
{
        String name;
        int s_id;
        static String college_name;
        
        static void show()
        {
                college_name = "BBIT";
                System.out.println("College: "+college_name);
                //System.out.println("Name: "+name+"\r\nStudent ID: "+s_id);
        }
        void display()
        {
                System.out.println("Name: "+name+" Student id: "+s_id);
        }
        Student(String n, int i)
        {
                name = n;
                s_id = i;
        }
}

class TestStatic
{
        public static void main(String[] args)
        {
                Scanner reader = new Scanner(System.in);
                System.out.println("Enter name of student: ");
                String n = reader.next();
                System.out.println("Enter student ID: ");
                int i = reader.nextInt();
                Student.show();
                Student s1 = new Student(n, i);
                s1.display();
                reader.close();
                
        }
}