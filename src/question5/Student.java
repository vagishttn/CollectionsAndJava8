package question5;

public class Student {
    private String studentName;
    private double studentAge;
    private double studentScore;

    public Student(String studentName, double studentAge, double studentScore) {
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentScore = studentScore;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(double studentAge) {
        this.studentAge = studentAge;
    }

    public double getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(double studentScore) {
        this.studentScore = studentScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", studentScore=" + studentScore +
                '}';
    }
}
