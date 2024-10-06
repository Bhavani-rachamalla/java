import java.io.*;
class Employee{
public static void main(String args[])
{
    float salary=500;
}
}
class Programmer extends Employee
{
    int bonus;
    void display()
    {
        //system.out.println("Salary of the employee is",+(salary+Bonus));
    }
    public static void main(String args[])
    {
        Employee e=new Employee();
        Programmer p=new Programmer();
        e.salary=500;
        p.bonus=150;
        System.out.println("salary of the employee is"+e.salary);
        System.out.println("Bonus for the programmer is"+p.bonus);
    }
}
