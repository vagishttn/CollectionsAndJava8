package question5;

import question4.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> employeeList = Arrays.asList(
                new Student("Gagan", 23D, 45D),
                new Student("Vagish", 24D, 70D),
                new Student("Aishabh", 22D, 45D),
                new Student("Karan", 73D, 69D)
        );

        System.out.println("--------Employee List Before Sorting---------");
        System.out.println(employeeList);
        Collections.sort(employeeList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getStudentScore() == o2.getStudentScore())
                    return o1.getStudentName().compareToIgnoreCase(o2.getStudentName());
                else return (int) (o1.getStudentScore() - o2.getStudentScore());
            }
        });
        System.out.println("--------Employee List After Sorting---------");
        System.out.println(employeeList);


    }
}
