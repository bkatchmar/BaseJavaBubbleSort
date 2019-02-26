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
  
        System.out.println("*UNSORTED*"); 
        System.out.println(""); 
        for (int i=0; i<stud.size(); i++) 
            System.out.println(stud.get(i)); 
  
        Collections.sort(stud, new Sortbyroll()); 
        System.out.println("\n**SORTED BY ROLL NO**"); 
        System.out.println(""); 
        for (int i=0; i<stud.size(); i++) 
            System.out.println(stud.get(i)); 
  
        Collections.sort(stud, new Sortbyname()); 
        System.out.println("\n**SORTED BY NAME**");
        System.out.println(""); 
        for (int i=0; i<stud.size(); i++) 
            System.out.println(stud.get(i)); 
        

        // Brian is screwing around below this line
        System.out.println("Brian Is Screwing Around Here");
        String[] someNames = {"Tony", "Brian", "Snickity"};
        CustomSelectionSort.sort(someNames);
        System.out.println(someNames);

        for (int i = 0; i < someNames.length; i++) {
            System.out.println(someNames[i]);
        }
    }
}