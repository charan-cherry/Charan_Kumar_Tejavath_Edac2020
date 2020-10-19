/*
//Problem 1

class Oopsjava{

public static void main(String args[])
{
System.out.println("Hello World");
}
}
*/


/*
//Problem 2

class Oopsjava{

public static void main(String args[])
{
int rollno=100;

System.out.println("rollno="+rollno);
}
}
*/


/*
//Problem 3.a

class Oopsjava{

public static void main(String args[])
{
int x=4,y;

y = x*x+3*x-7;
  


System.out.println(y);
}
}
*/


/*
//Problem 3.b

class Oopsjava{

public static void main(String args[])
{
int x,y;
x=4;
y=6;

y = x++ + ++x;  

System.out.println("x="+x);
System.out.println("y="+y);
}
}
*/


/*
//Problem 3.c

class Oopsjava{

public static void main(String args[])
{
int x,y,z;
x=4;
y=6;
z=3;

z = x++ - --y - --x  +  x++;

System.out.println("x="+x);
System.out.println("y="+y);
System.out.println("z="+z);

}
}
*/


/*
//Problem 3.d

class Oopsjava{

public static void main(String args[])
{

boolean x=true;
boolean y=true;
boolean z=false;

z = x && y || !(x || y);

//System.out.println("x="+x);
//System.out.println("y="+y);
System.out.println("z="+z);

}
}
*/





/*
//Problem 4
import java.util.Scanner;

class Oopsjava{

public static void main(String args[])
{


Scanner test=new Scanner(System.in);

byte a,b;

System.out.println("enter first number");
a=test.nextByte();
System.out.println("enter second number");
b=test.nextByte();

byte c=(byte)(a+b);
System.out.println("Sum of byte numbers is stored in byte and number = " +c);

}
}

*/


/*
//Problem 5


class Oopsjava{

public static void main (String args[]) 
	{
	

System.out.print("Welcome "+args[0]);

}
}
*/


/*
//Problem 6

import java.util.*;
class Oopsjava{

public static void main (String args[]) 
	{
Scanner abc=new Scanner(System.in);	
double r,Area,Circum;
System.out.print("Enter radius of circle=");
r=abc.nextDouble();
Area=Math.PI*r*r;
Circum=2*Math.PI*r;
System.out.println("Area of circle is="+Area);
System.out.println("Cir of circle is="+Circum);

}
}

*/


/*
//Problem 7


import java.io.*;
import java.util.*;


class Oopsjava
{
	public static void main(String args[]) 
	{
	int sum=0;
	int n=5;
	double per=0;
	Scanner ab=new Scanner(System.in);
	System.out.println("Enter five subject marks=");
	int a[]=new int[5];
	for(int i=0;i<=4;i++)
	{
	a[i]=ab.nextInt();
	sum=sum+a[i];
	
	}
	System.out.println("Total marks"+sum);
	per=sum;
	per=(per/500)*100;
	System.out.println("Percentage="+per + " %");
}
}

*/


/*
//Problem 8

import java.io.*;
import java.util.*;


class Oopsjava
{
	public static void main(String args[]) 
	{
	Scanner ab=new Scanner(System.in);
	System.out.println("Enter Data to get Simple Interest");
	double si,ammount,time,rate;
	System.out.println("Enter Principle Ammount=");
	ammount=ab.nextDouble();
	System.out.println("Enter Time in Years=");
	time=ab.nextDouble();
	System.out.println("Enter Rate=");
	rate=ab.nextDouble();
	si=(ammount*time*rate)/100;
	System.out.println("Simple Interest is="+si);
}
}

*/


/*
//Problem 9

import java.io.*;
import java.util.*;


class Oopsjava
{
	public static void main(String args[]) 
	{
	
	int days,months;
	double years;
	Scanner ab=new Scanner(System.in);
	System.out.println("Enter no of Days=");
	days=ab.nextInt();
	months=days/30;
	years=days/365;
	System.out.println("No of Months="+months);
	System.out.println("No of Years="+years);

}
}
*/


/*
//Problem 10

import java.io.*;
import java.util.*;


class Oopsjava
{
	public static void main(String args[]) 
	{
	
		Scanner ab=new Scanner(System.in);
		System.out.println("enter the fahrenheit temperature :");
		double f = ab.nextDouble(),celcius;
		celcius = 5*(f-32)/9;
		System.out.println(celcius);
}
}
*/


/*
//Problem 11

import java.io.*;
import java.util.*;


class Oopsjava
{
	public static void main(String args[]) 
	{
	Scanner ab = new Scanner(System.in);
		System.out.println("enter a,b values :");
		int a = ab.nextInt();
		int b = ab.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println();
		System.out.println(a);
		System.out.println(b);
}
}
*/

/*
//Problem 12

import java.io.*;
import java.util.*;


class Oopsjava
{
	public static void main(String args[]) 
	{
	Scanner ab = new Scanner(System.in);
	System.out.println("Enter your basic pay:");
		double hra=0;
		double da=0;
		double gs=0;
		double bp=ab.nextInt();
		if(bp<10000)
		{
			hra=bp*(0.1);
			da=bp*(0.9);
			gs=bp+da+hra;
		System.out.println("Your Gross Salary="+gs);
		}
		else if(bp>=10000)
		{
			hra=2000;
			da=bp*(0.98);
			gs=bp+da+hra;
		System.out.println("Your Gross Salary="+gs);
		}
		
}
}
*/

/*
// problem--13
  import java.util.Scanner;
class Oopsjava {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 3 values :");
		int tata = scan.nextInt();
		int apple = scan.nextInt();
		int royace = scan.nextInt(),result,temp;
		
		
		if(tata > apple && tata > royace)
		{
			System.out.println("greatest number is  "+tata);
		}
		else
		{
		if(apple > royace)
		{
			System.out.println("greatest number is "+apple);
		}
		else
		{
			System.out.println("greatest number is "+royace);
			
		}
	}
           
    //   temp = (tata>apple)?tata:apple;
    //    result = (royace>temp)?royace:temp;
    //     System.out.println("greatest num is  "+result);
     
    //  	   result = royace >(tata>apple?tata:apple)?royace:((tata>apple)?tata:apple);
	//	   System.out.println("greatest num is  "+result);			        
}
}
*/




// problem--14
  /*import java.util.Scanner;
class Oopsjava {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the year :");
		int year = scan.nextInt(),leapyear;
		if(year%4 == 0)
		{
		System.out.println("leapyear");
	}
		else
		{
			System.out.println("not a leapyear");
		}
   }
 }*/






    // problem--15
   /* import java.util.Scanner;
class Oopsjava {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two characters :");
		String m = scan.next();
		String f = scan.next();
		
		System.out.println("enter age :");
		int age = scan.nextInt();
		if(age>=24)
		{
			System.out.println("both m and f are eligiable for marriage");
		}
		else
		{
			System.out.println("both m and f are not eligiable for marriage");
		}
		}
}*/








