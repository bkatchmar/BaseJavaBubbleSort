import java.util.*;
import java.lang.*;
import java.io.*;

public class CustomSelectionSort
{
    // Sort a String array using selection sort.
    public static void sort(String[] a)
    {
        for (int i=0; i<a.length-1; i++)
        {
            for (int j=i+1; j<a.length; j++)
            {
                if (a[i].compareTo(a[j]) > 0)
                {
                    String holder = a[j];
                    a[j] = a[i];
                    a[i] = holder;
                }
            }
        }
    }

    public static void sortByRollNumber(student[] students) {
        // First pass for the selection sort
        for (int x = 0; x < students.length; x++) {
            // Second pass for the selection sort
            for (int y = 0; y < students.length; y++) {
                student first = students[x];
                student second = students[y];

                if (first.rollno < second.rollno) {
                    student temp = students[y];
                    students[y] = students[x];
                    students[x] = temp;
                }
            }
        }
    }

    public static void sortByName(student[] students) {
        
    }
}