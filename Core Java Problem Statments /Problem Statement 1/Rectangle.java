package ProblemStatement1_4;

import java.util.Scanner;

public class Rectangle {
	public float length, width;
	public Rectangle() 
	{
	  length = 1;
	  width = 1;
	 }
	
	 public float perimeter()
	 {
	 return (length+width)*2;
	 }
	 
	 public float area()
	 {
	 return length*width;
	 }
	 
	 public void setValues(float length,float width)
	 {
	  if (length > 0 && length < 20)
	   this.length = length;
	  
	  if (width > 0 && width < 20)
	
	   this.width = width;
	 }
	
	 public float length()
	 {
	  return length;
	 }
	
	 public float width()
	 {
	  return width;
	 }
	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);
		 Rectangle obj=new Rectangle();
		 System.out.print("length :");
		 float length=sc.nextFloat();
		 System.out.print("width :");
		 float width=sc.nextFloat();
		 obj.perimeter();
		 obj.area();
		 obj.setValues(length,width);
		 obj.length();
		 obj.width();
	 }
	 }

	

