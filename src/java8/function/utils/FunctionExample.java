package java8.function.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

    public static List<String> getEmployeeName(List<Employee> employeeList, Function<Employee, String> funcEmpToString) {
        List<String> empNameList = new ArrayList<String>();
        for (Employee emp : employeeList) {
            empNameList.add(funcEmpToString.apply(emp));
        }
        return empNameList;
    }

    public static void main(String[] args) {

        Function<Employee, String> employeeStringFunction = (Employee e) -> e.getName();

        List<Employee> employeeList = Arrays.asList(
                new Employee("Vagish", 23, "m"),
                new Employee("Surbhi", 23, "f"),
                new Employee("Yukti", 15, "f"),
                new Employee("Gagan", 17, "m"),
                new Employee("Prateek", 23, "m"),
                new Employee("Kamna", 23, "f"));

        List<String> strings = getEmployeeName(employeeList, employeeStringFunction);
        strings.forEach(System.out::println);


    }
}
