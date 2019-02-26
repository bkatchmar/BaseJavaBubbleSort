import java.util.*;
import java.lang.*;
import java.io.*;

public class CustomSelectionSort
{
    public void sortByRollNumber(student[] students) {
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

    public void sortByName(student[] students) {
        // First pass for the selection sort
        for (int x = 0; x < students.length; x++) {
            // Second pass for the selection sort
            for (int y = 0; y < students.length; y++) {
                student first = students[x];
                student second = students[y];

                if (first.name.compareTo(second.name) < 0) {
                    student temp = students[y];
                    students[y] = students[x];
                    students[x] = temp;
                }
            }
        }
    }
}