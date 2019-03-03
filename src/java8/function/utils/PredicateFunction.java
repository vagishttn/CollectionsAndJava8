package java8.function.utils;


import java.util.Arrays;
import java.util.List;

import static java8.function.utils.EmployeePredicate.*;

public class PredicateFunction {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee("Vagish", 23, "m"),
                new Employee("Surbhi", 23, "f"),
                new Employee("Yukti", 15, "f"),
                new Employee("Gagan", 17, "m"),
                new Employee("Prateek", 23, "m"),
                new Employee("Kamna", 23, "f"));

        System.out.println(filterEmployees(employeeList, isAdultMale()));
        System.out.println(filterEmployees(employeeList, isAdultFemale()));
        System.out.println(filterEmployees(employeeList, isAgeGreater(34)));
        System.out.println(filterEmployees(employeeList, isAgeGreater(34).negate()));
        System.out.println(filterEmployees(employeeList, isAgeLess(23).and(isAgeGreater(15))));

    }


}
