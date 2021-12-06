import java.util.Scanner;
abstract class Employee
{ 
        String name, doj;
        int emp_id;
        double grossSalary;
                
        void getInfo(String n, int id, String date)
        {
                name = n;
                emp_id = id;
                doj = date;
                System.out.println("Name: "+name+"\r\nEmployee_id: "+id+"\r\nDate of Joining: "+doj);
        }
        abstract double getSal();
}

class Manager extends Employee
{
        double basicPay = 65000;
        double allowancePercent=99;
        
        public double getSal()
        {
                grossSalary = basicPay + ((allowancePercent/100)*basicPay);
                return grossSalary;
        }
}

class Salesman extends Employee
{
        double basicPay = 15000;
        double allowancePercent=85;
        
        public double getSal()
        {
                grossSalary = basicPay + ((allowancePercent/100)*basicPay);
                return grossSalary;
        }
}

class CalculateSalary
{
        public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter name of Manager: ");
        String n1 = reader.next();
        System.out.println("Enter employee_id of Manager: ");
        int id1 = reader.nextInt();
        System.out.println("Enter date of joining of Manager: ");
        String d1 = reader.next();
        System.out.println("Enter name of Salesman: ");
        String n2 = reader.next();
        System.out.println("Enter employee_id of Salesman: ");
        int id2 = reader.nextInt();
        System.out.println("Enter date of joining of Salesman: ");
        String d2 = reader.next();
        reader.close();
        
        Employee emp1 = new Manager();
        Employee emp2 = new Salesman();
        System.out.println("\r\nDetails of Manager: ");
        emp1.getInfo(n1, id1, d1);
        System.out.println("Gross Salary: Rs."+emp1.getSal());
        System.out.println("\r\nDetails of Salesman: ");
        emp2.getInfo(n2, id2, d2);
        System.out.println("Gross Salary: Rs."+emp2.getSal());
        }
}
        
        
        