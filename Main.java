import java.io.*;

class Employee{
	public void Employe()
{
System.out.println("IAM EMPLOYEE");
}
public void work()
{
System.out.println("IAM WORKING AS AN EMPLOYEE");
}
}

class Manager extends Employee
{
public void Manage()
{

System.out.println("IAM MANAGER");
}
public void work()
{
super.work();
System.out.println("IAM WORKING AS MANAGER");
}
}

class ProjectManager extends Manager
{
public void ProjectMngr()
{
System.out.println("IAM PROJECT MANAGER");
}
public void work()
{
super.work();
System.out.println("IAM WORKING AS PROJ MANAGER");
}
}

public class Main
{
public static void main (String args[])
{
Employee emp=new Employee();
Manager mng=new Manager();
ProjectManager proj=new ProjectManager();
emp.Employe();
emp.work();
mng.work();
proj.work();
System.out.println("THANKYOU");
}
}

