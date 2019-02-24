package question4;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Vagish", 24D, 1000D),
                new Employee("Gagan", 23D, 990D),
                new Employee("Rishabh", 22D, 1990D),
                new Employee("Karan", 73D, 2990D)
        );

        System.out.println("--------Employee List Before Sorting---------");
        System.out.println(employeeList);
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getEmployeeSalary() - o1.getEmployeeSalary());
            }
        });
        System.out.println("-------------Employee List After Sorting------------");
        System.out.println(employeeList);
    }
}
