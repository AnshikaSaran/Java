//Aggregation is a "has-a" relationship where the contained objects can exist independently of the container.
  class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class University {
    private String name;
    private Department department;

    public University(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public void showDetails() {
        System.out.println("University: " + name + ", Department: " + department.getName());
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Department dept = new Department("Computer Science");
        University university = new University("ABC University", dept);
        university.showDetails();
    }
}


//Problem: Create a School class that aggregates multiple Student objects. Implement a method to list all students.
import java.util.ArrayList;
import java.util.List;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class School {
    private List<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void listStudents() {
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }
}

// Example usage
public class AggregationExample {
    public static void main(String[] args) {
        School school = new School();
        school.addStudent(new Student("Alice"));
        school.addStudent(new Student("Bob"));
        school.listStudents();
    }
}
