package queues;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class PriorityQueueComparatorDemo {
    public static void main(String[] args){
         // Creating Priority queue constructor having
        // initial capacity=5 and a StudentComparator instance
        // as its parameters
        Queue<Student> pq = new
                PriorityQueue<Student>(5, new StudentComparator());

        // Invoking a parameterized Student constructor with
        // name and cgpa as the elements of queue
        Student student1 = new Student("Egor", 3.5);

        // Adding a student object containing fields
        // name and cgpa to priority queue
        pq.add(student1);
        Student student2 = new Student("Emily", 3.6);
        pq.add(student2);
        Student student3 = new Student("Julia", 4.0);
        pq.add(student3);

        Student student4 = new Student("Kyle", 3.9);
        pq.add(student4);

        // Printing names of students in priority order,poll()
        // method is used to access the head element of queue
        System.out.println("Students served in their priority order");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll().getName());
        }
    }
}

class StudentComparator implements Comparator<Student> {

    // Overriding compare()method of Comparator
    // for descending order of cgpa
    public int compare(Student s1, Student s2) {
        if (s1.cgpa < s2.cgpa)
            return 1;
        else if (s1.cgpa > s2.cgpa)
            return -1;
        return 0;
    }
}

class Student {
    public String name;
    public double cgpa;

    // A parameterized student constructor
    public Student(String name, double cgpa) {

        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }
}