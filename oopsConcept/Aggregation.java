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
