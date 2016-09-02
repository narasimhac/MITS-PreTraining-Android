import java.io.*;
import java.util.*;
abstract class Shape 
{
  String color;
  boolean filled;
   
    public abstract String getColor();
    public abstract void setColor(String color);
    public abstract boolean isFilled();
    public abstract void setFilled(boolean filled);
    public abstract double getArea();
    public abstract double getPerimeter();
    

}

 class Circle extends Shape 
{
    private  double radius,area,perimeter;
    final double pi = Math.PI;
public String getColor()
{
Scanner obj=new Scanner(System.in);
System.out.println("enter Circle color:");
color=obj.next();
return color;
}

public boolean isFilled()
{
Scanner obj=new Scanner(System.in);
System.out.println("enter Circle Filled:");
filled=obj.nextBoolean();
return filled;
}

  public double getRadius()
{
Scanner obj=new Scanner(System.in);
System.out.println("enter radius:");
radius=obj.nextDouble();
return radius;
}


     public double getArea() 
{
        
        area= pi * Math.pow(radius, 2);
	return area;
    }

    public double getPerimeter() 
{
       
        

perimeter=2 * pi * radius;
return perimeter;
    }

public void setColor(String color)
{
System.out.println("the circle color is "+color);
}
public void setFilled(boolean filled)
{
System.out.println("the circle filled "+filled);
}

public void setRadius(double radius)
{
System.out.println("the circle radius is "+radius);
}
public void setArea(double area)
{
System.out.println("the circle area is "+area);
}
public void setPerimeter(double perimeter)
{
System.out.println("the circle perimeter is "+perimeter);
}
}

 class Rectangle extends Shape 
{
    private  double width, length,area,perimeter;
public String getColor()
{
Scanner obj=new Scanner(System.in);
System.out.println("enter Rectangle  color:");
color=obj.next();
return color;
}

public boolean isFilled()
{
Scanner obj=new Scanner(System.in);
System.out.println("enter rectangle Filled:");
filled=obj.nextBoolean();
return filled;
}


public double getWidth()
{
Scanner obj=new Scanner(System.in);
System.out.println("enter width:");
width=obj.nextDouble();
return width;
}

public double getLength()
{
Scanner obj=new Scanner(System.in);
System.out.println("enter length:");
length=obj.nextDouble();
return length;
}

public double getArea() 
{
        
        area= length*width;
	return area;
    }

    public double getPerimeter() 
{
       
        

perimeter =2 * (width + length);
return perimeter;
    }


public void setColor(String color)
{
System.out.println("the rectangle color is "+color);
}
public void setFilled(boolean filled)
{
System.out.println("the rectangle filled "+filled);
}

public void setWidth(double width)
{
System.out.println("the rectangle width is "+width);
}
public void setLength(double Length)
{
System.out.println("the rectangle length is "+length);
}       

public void setArea(double area)
{
System.out.println("the rectangle area is "+area);
}
public void setPerimeter(double perimeter)
{
System.out.println("the rectangle perimeter is "+perimeter);
}

 
}

class Square extends Rectangle
{
private  double side,area,perimeter;
public String getColor()
{
Scanner obj=new Scanner(System.in);
System.out.println("enter square color:");
color=obj.next();
return color;
}

public boolean isFilled()
{
Scanner obj=new Scanner(System.in);
System.out.println("enter square Filled:");
filled=obj.nextBoolean();
return filled;
}

  public double getSide()
{
Scanner obj=new Scanner(System.in);
System.out.println("enter side:");
side=obj.nextDouble();
return side;
}


public double getArea()
{

 area=side * side;
 return area;
}
public double getPerimeter() {

        perimeter= 4 * side;
return perimeter;    
}


public void setSide(double side)
{
System.out.println("the square side is "+side);
}       

public void setArea(double area)
{
System.out.println("the square area is "+area);
}
public void setPerimeter(double perimeter)
{
System.out.println("the square perimeter is "+perimeter);
}



}

public class Test2
{
public static void main(String... aaa)throws Exception
{
Circle c=new Circle();
String color=c.getColor();
boolean filled=c.isFilled();
double radius=c.getRadius();
double area=c.getArea();
double perimeter=c.getPerimeter();
c.setColor(color);
c.setFilled(filled);
c.setRadius(radius);
c.setArea(area);
c.setPerimeter(perimeter);

Rectangle r=new Rectangle();
 color=r.getColor();
filled=r.isFilled();
double width=r.getWidth();
double length=r.getLength();
 area=r.getArea();
 perimeter=r.getPerimeter();
r.setColor(color);
r.setFilled(filled);
r.setWidth(width);
r.setLength(length);
r.setArea(area);
r.setPerimeter(perimeter);

Square s=new Square();
 color=s.getColor();
filled=s.isFilled();
double side=s.getSide();
 area=s.getArea();
 perimeter=s.getPerimeter();
s.setColor(color);
s.setFilled(filled);
s.setSide(width);
s.setArea(area);
s.setPerimeter(perimeter);

}
}


