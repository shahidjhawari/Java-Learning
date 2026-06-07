class Teacher {

    String name;
    int age;

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {

    public static void main(String[] args) {
        Staff staff1 = new Staff();
        staff1.email = "ali@example.com";
        staff1.salary = 50000;
        staff1.getInfo();

    }
}


class Staff {
    String email;
    int salary;

    void getInfo() {
        System.out.println("Email: " + email);
        System.out.println("Salary: " + salary);
    }
}