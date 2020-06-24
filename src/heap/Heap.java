package heap;

public class Heap
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Becky", "012264445");
        Student s2 = new Student("Dinh", "012264446");
        Student s3 = new Student("Bun", "506416371");
        Student s4 = new Student("Boons", "377647465");
        Student s5 = new Student("Andy", "012264447");
        Student s6 = new Student("Kathy", "041634564");
        Student s7 = new Student("Thomas", "503918754");
        Student s8 = new Student("Tracy", "749206773");
        Student s9 = new Student("Cindy", "457014783");
        Student s10 = new Student("Han", "126726630");
        HeapSort hs = new HeapSort();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);
        hs.add(s6);
        hs.add(s7);
        hs.add(s8);
        hs.add(s9);
        hs.add(s10);
        System.out.println(hs.toString());
        hs.heapSort();
        System.out.print("Heap Sort\n" + hs.toString());
    }
}

