import java.util.*;

public class PrioQueEg {
    public static PriorityQueue<Student> student_lst = new PriorityQueue<>((a,b) -> (int) (b.getGrade() - a.getGrade()));
    public static void main(String[] args) {
        Student student2 = new Student("Steven", 3.5);
        Student student3 = new Student("Xuan Xi", 100);
        Student student1 = new Student("Myo", 4.5);
        Student student4 = new Student("Camila", 1);
        student_lst.add(student2);
        student_lst.add(student1);
        student_lst.add(student3);
        student_lst.add(student4);

        Iterator<Student> iterator = student_lst.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
    }
}

class StudentComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.getGrade() < s2.getGrade())
            return 1;
        else if (s1.getGrade() > s2.getGrade())
            return -1;
        return 0;
    }
}
