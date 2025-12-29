class Employee {
    String name;
    int salary;

    Employee(String n, int s) {  // constructor
        name = n; salary = s;
    }

    void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("XeppY", 25000);
        e1.display();
    }
}
