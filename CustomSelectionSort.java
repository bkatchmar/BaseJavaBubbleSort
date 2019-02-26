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
}