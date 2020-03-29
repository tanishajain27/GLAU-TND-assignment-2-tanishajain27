/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
import problem3.myqueue.MyPriorityQueue;
import problem3.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        queue.enqueue(new Student("Am",05));
        queue.enqueue(new Student("Anu",10));
        queue.enqueue(new Student("Hri",17));
        queue.enqueue(new Student("Neeti",25));
        queue.enqueue(new Student("Pratibha",33));
        queue.enqueue(new Student("Rohi",39));
        queue.enqueue(new Student("Vib",50));

        queue.show();
        queue.dequeue();
        queue.show();

    }
}
