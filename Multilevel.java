import java.util.*;
class Person
{
String name;
String gender;
String address;
int age;
Person()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name:");
name=sc.next();
System.out.println("Enter gender:");
gender=sc.next();
System.out.println("Enter the address:");
address=sc.next();
System.out.println("Enter age:");
age=sc.nextInt();
}
}
class Employee extends Person
{
int empid;
String companyname;
String quali;
double salary;
Employee()
{
Scanner sc1=new Scanner(System.in);
System.out.println("Enter emloyee id:");
empid=sc1.nextInt();
System.out.println("Enter company name:");
companyname=sc1.next();
System.out.println("Enter qualification:");
quali=sc1.next();
System.out.println("Enter salary:");
salary=sc1.nextDouble();
}
}
class Teacher extends Employee
{
String subject;
String department;
int trid;
Teacher()
{
Scanner sc2=new Scanner(System.in);
System.out.println("Enter the subject:");
subject=sc2.next();
System.out.println("Enter the department:");
department=sc2.next();
System.out.println("Enter teacher id:");
trid=sc2.nextInt();
}

void display()
{
System.out.println("---------------------");
System.out.println("Name"+name);
System.out.println("Gender"+gender);

System.out.println("Address"+address);

System.out.println("Age"+age);
System.out.println("Employeeid"+empid);

System.out.println("Company name"+companyname);
System.out.println("Qualification"+quali);
System.out.println("Salary"+salary);
System.out.println("Subject"+subject);
System.out.println("Department"+department);
System.out.println("teacherid"+trid);
System.out.println("-----------------------------");
}
}
class Multilevel
{
public static void main(String args[])
{
int n;
Scanner sc3=new Scanner(System.in);
System.out.println("Enter the no of employees");
n=sc3.nextInt();
Teacher[] t=new Teacher[n];
for(int i=0;i<n;i++)
{
t[i]=new Teacher();
}
System.out.println("---------------------------");
System.out.println("The details are:");
for(int i=0;i<n;i++)
{
t[i].display();
}
}
}



