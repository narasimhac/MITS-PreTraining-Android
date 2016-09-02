import java.io.*;
import java.util.*;
interface Person
{
public String getName();
public String getAddress();

public void setAddress(String address);
}
class Student implements Person
{
String name, address;
String program;
int year;
double fee;

public String getName()
{
Scanner obj=new Scanner(System.in);
System.out.println("enter name");
name=obj.next();
return name;
}

public String getAddress()
{
Scanner obj=new Scanner(System.in);
System.out.println("enter Address");
address=obj.nextLine();
return address;
}

public void setName(String name)
{
System.out.println("the name is"+name);
}

public void setAddress(String address)
{
System.out.println("the address is "+address);
}

public String getProgram()
{
Scanner obj=new Scanner(System.in);
System.out.println("enter program");
program=obj.next();
return program;
}

public void setProgram(String program)
{
System.out.println("the program name is"+program);
}

public int getYear()
{
Scanner obj=new Scanner(System.in);
System.out.println("enter Year");
year=obj.nextInt();
return year;
}

public void setYear(int year)
{
System.out.println("the year of student is"+year);
}

public double getFee()
{
Scanner obj=new Scanner(System.in);
System.out.println("enter Fee");
fee=obj.nextDouble();
return fee;
}

public void setFee(double fee)
{
System.out.println("the fee of the student is "+fee);
}
}
class Test
{
public static void main(String... aaa)throws Exception
{
Student s=new Student();
String name=s.getName();
String address=s.getAddress();
String program=s.getProgram();
int year=s.getYear();
double fee=s.getFee();
s.setName(name);
s.setAddress(address);
s.setProgram(program);
s.setYear(year);
s.setFee(fee);

}
}

