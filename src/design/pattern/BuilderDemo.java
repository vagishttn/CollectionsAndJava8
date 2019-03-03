package design.pattern;

import java.time.LocalDate;

class Student {
    private String name;
    private Integer age;
    private String course;
    private LocalDate passingYear;
    private String fatherName;
    private String motherName;

    Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.getName();
        this.age = studentBuilder.getAge();
        this.course = studentBuilder.getCourse();
        this.passingYear = studentBuilder.getPassingYear();
        this.fatherName = studentBuilder.getFatherName();
        this.motherName = studentBuilder.getMotherName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public LocalDate getPassingYear() {
        return passingYear;
    }

    public void setPassingYear(LocalDate passingYear) {
        this.passingYear = passingYear;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", passingYear=" + passingYear +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                '}';
    }
}

class StudentBuilder {

    private String name;
    private Integer age;
    private String Course;
    private LocalDate passingYear;
    private String fatherName;
    private String motherName;

    public String getName() {
        return name;
    }

    public StudentBuilder hasName(String name) {
        this.name = name;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public StudentBuilder hasAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getCourse() {
        return Course;
    }

    public StudentBuilder selectedCourse(String course) {
        Course = course;
        return this;
    }

    public LocalDate getPassingYear() {
        return passingYear;
    }

    public StudentBuilder hasPassingYear(LocalDate passingYear) {
        this.passingYear = passingYear;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public StudentBuilder hasFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public String getMotherName() {
        return motherName;
    }

    public StudentBuilder hasMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}

public class BuilderDemo {

    public static void main(String[] args) {
        Student student = new StudentBuilder()
                .hasName("vagish Dixit")
                .hasAge(24)
                .hasFatherName("Vinod")
                .hasMotherName("Sujata")
                .hasPassingYear(LocalDate.now())
                .selectedCourse("MCA")
                .build();
        System.out.println(student);
    }
}
