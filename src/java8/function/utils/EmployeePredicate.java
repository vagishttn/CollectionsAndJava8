package java8.function.utils;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicate {

    public static Predicate<Employee> isAdultMale() {
        return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("m");
    }


    public static Predicate<Employee> isAdultFemale() {
        return p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("f");
    }

    public static Predicate<Employee> isAgeGreater(Integer age) {
        return p -> p.getAge() > age;
    }

    public static Predicate<Employee> isAgeLess(Integer age) {
        return p -> p.getAge() < age;
    }

    public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
        return employees
                .stream()
                .filter(predicate)
                .collect(Collectors.<Employee>toList());
    }

}
