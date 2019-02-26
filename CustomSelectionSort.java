import java.util.*;
import java.lang.*;
import java.io.*;

public class CustomSelectionSort
{
    public void sortByRollNumber(ArrayList<student> students) {
        // First pass for the selection sort
        for (int x = 0; x < students.size(); x++) {
            // Second pass for the selection sort
            for (int y = 0; y < students.size(); y++) {
                student first = students.get(x);
                student second = students.get(y);

                if (first.rollno < second.rollno) {
                    student temp = students.get(y);
                    students.set(y, students.get(x));
                    students.set(x, temp);
                }
            }
        }
    }

    public void sortByName(ArrayList<student> students) {
        // First pass for the selection sort
        for (int x = 0; x < students.size(); x++) {
            // Second pass for the selection sort
            for (int y = 0; y < students.size(); y++) {
                student first = students.get(x);
                student second = students.get(y);

                if (first.name.compareTo(second.name) < 0) {
                    student temp = students.get(y);
                    students.set(y, students.get(x));
                    students.set(x, temp);
                }
            }
        }
    }
}