public class SuperExample {
    void message()
    {
        System.out.println("This is parent class");
    }
}

class Student extends SuperExample {
    void message()
    {
        System.out.println("This is child class");
    }

    void display()
    {
        message();
        super.message();
    }
}

class MainTest {
    public static void main(String args[])
    {
        Student s = new Student();

        s.display();
    }
}
