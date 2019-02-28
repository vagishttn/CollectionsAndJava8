package java8;

class Employee {
    String name;
    Integer age;
    String city;

    public Employee(String name, Integer age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}

@FunctionalInterface
interface EmployeeFactory {

    Employee createEmployee(String name, Integer age, String city);

}


public class ConstructorRefrence {

    public static void main(String[] args) {

        EmployeeFactory employeeFactory = Employee::new;

        System.out.println(employeeFactory.createEmployee("vagish", 24, "delhi"));

    }
}
