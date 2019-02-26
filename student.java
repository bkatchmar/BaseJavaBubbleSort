import java.util.*;
import java.lang.*;
import java.io.*;

public class student 
{
	int rollno;
	String name;
	String address;
	
	public student (int rollno, String name, String address) 
	{
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		
	}
	
	public String toString()
	{
		return this.rollno + " " + this.name + " " + " " + this.address;
	}

}

class Sortbyroll implements Comparator<student>
{
	public int compare (student A, student B)
	{
		return A.rollno - B.rollno;
	}
}

class Sortbyname implements Comparator<student>
{
	public int compare (student A, student B)
	{
		return A.name.compareTo(B.name); 
	}
}