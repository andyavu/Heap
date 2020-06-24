package heap;

import java.util.*;

public class Student
{
    Random random = new Random();
    private String name, broncoID;
    private int age, totalMarks;
    
    public Student(String name, String broncoID)
    {
        this.name = name;
        this.broncoID = broncoID;
        age = random.nextInt(11) + 15;
        totalMarks = random.nextInt(101);
    }
    public String getName()
    {
        return name;
    }
    public String getBroncoID()
    {
        return broncoID;
    }
    public int getAge()
    {
        return age;
    }
    public int getTotalMarks()
    {
        return totalMarks;
    }
    public String toString()
    {
        return "\t" + name + " \t" + broncoID + "\t" + age + "\t" + totalMarks;
    }
}

