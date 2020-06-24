package heap;

public class HeapSort
{
    private final int MAX_STUDENTS = 10;
    private int numStudents;
    private Student[] student;
    
    public HeapSort()
    {
        numStudents = 0;
        student = new Student[MAX_STUDENTS];
    }
    public void add(Student s)
    {
        int i = numStudents;
        for( ; i < MAX_STUDENTS; i++)
        {
            student[i] = s;
        }
        numStudents++;
    }
    public void heapSort()
    {
        for(int i = MAX_STUDENTS / 2 - 1; i >= 0; i--)
        {
            heapify(student, MAX_STUDENTS, i);
        }
        for(int i = MAX_STUDENTS - 1; i >= 0; i--)
        {
            Student temp = student[0];
            student[0] = student[i];
            student[i] = temp;
            heapify(student, i, 0);
        }
    }
    public void heapify(Student s[], int n, int i)
    {
        int max = i;
        int left = (i * 2) + 1;
        int right = (i * 2) + 2;
        if (left < n && s[left].getTotalMarks() > s[max].getTotalMarks())
        {
            max = left; 
        }
        if (right < n && s[right].getTotalMarks() > s[max].getTotalMarks())
        {
            max = right;
        } 
        if (max != i) 
        { 
            Student swap = s[i]; 
            s[i] = s[max]; 
            s[max] = swap; 
            heapify(s, n, max);  
        }
    }
    public String toString()
    {
        String str = "";
        int i = 0;
        str += "\tName\tBronco ID\tAge\tTotal Marks"
                + "\n-----------------------------------------------------------\n";
        for( ; i < numStudents - 1; i++)
        {
            str += " " + (i + 1) + ".) " + student[i] + "\n";
        }
        str += (i + 1) + ".) " + student[i] + "\n";
        return str;
    }
}
