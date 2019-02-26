import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args)
	{
        ArrayList<student> stud = new ArrayList<student>();
        stud.add(new student(45, "Ashley", "Houston"));
        stud.add(new student(26, "Tony", "Buffalo"));
        stud.add(new student(33, "Bob", "Cleveland"));
        stud.add(new student(98, "Charles", "San Francisco"));
        stud.add(new student(65, "Joe", "Washington DC"));
        stud.add(new student(88, "Steph", "Boston"));
        stud.add(new student(39, "Tommy", "Miami"));
        stud.add(new student(81, "Ken", "Orlando"));
        stud.add(new student(90, "Andy", "Las Vegas"));
        stud.add(new student(100, "George",  "Chicago"));

        CustomSelectionSort sorter = new CustomSelectionSort();
        
        // Show the unsorted list
        System.out.println("*UNSORTED*");
        System.out.println("");

        // Loop through and print each item on the list
        for (int i = 0; i < stud.size(); i++) {
            System.out.println(stud.get(i).toString());
        }
  
        // Sort list by ROLL NO
        System.out.println("\n**SORTED BY ROLL NO**");
        sorter.sortByRollNumber(stud);
        
        // Show roll number sorted list
        for (int i = 0; i < stud.size(); i++) {
            System.out.println(stud.get(i).toString());
        }

        // Sort list by student name
        System.out.println("\n**SORTED BY STUDENT NAME**");
        sorter.sortByName(stud);

        // Show name sorted list
        for (int i = 0; i < stud.size(); i++) {
            System.out.println(stud.get(i).toString());
        }
    }
}