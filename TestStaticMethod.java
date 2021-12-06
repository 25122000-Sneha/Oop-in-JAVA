/*Create a class called student which contains two instance variable name and s_id. The other parameter is the college name which is static. Create a static method show() which will contain the college name. Create another method display() which will display  instance variables. Show what happens if we call instance variables in a static method. Call both the methods from main(). */

import java.util.Scanner;
class Student
{
        String name;
        int s_id;
        static String college_name = "BBIT";
        
        static void show()
        {
                System.out.println("College: "+college_name);
                //System.out.println("Name: "+name+"Student ID: "+s_id);
        }
        void display()
        {
                System.out.println("Name: "+name+"\r\nStudent id: "+s_id);
        }
        Student(String n, int i)
        {
                name = n;
                s_id = i;
        }
}

class TestStaticMethod
{
        public static void main(String[] args)
        {
                Scanner reader = new Scanner(System.in);
                System.out.println("Enter name of student: ");
                String n = reader.next();
                System.out.println("Enter student ID: ");
                int i = reader.nextInt();
                reader.close();
                Student s1 = new Student(n, i);
                Student.show();
                s1.display();
                
        }
}