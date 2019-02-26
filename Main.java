import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args)
	{
        student[] studentList = {
            new student(45, "Ashley", "Houston"),
            new student(26, "Tony", "Buffalo"),
            new student(33, "Bob", "Cleveland"),
            new student(98, "Charles", "San Francisco"),
            new student(65, "Joe", "Washington DC"),
            new student(88, "Steph", "Boston"),
            new student(39, "Tommy", "Miami"),
            new student(81, "Ken", "Orlando"),
            new student(90, "Andy", "Las Vegas"),
            new student(100, "George",  "Chicago")
        };
		
        System.out.println("*UNSORTED*");
        System.out.println("");

        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i].toString());
        }
  
        System.out.println("\n**SORTED BY ROLL NO**");
        CustomSelectionSort.sortByRollNumber(studentList);
        
        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i].toString());
        }
    }
}