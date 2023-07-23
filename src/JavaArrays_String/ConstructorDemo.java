package JavaArrays_String;

public class ConstructorDemo {
    int x;
    int y;

    ConstructorDemo() // default constructor
    {
        x=10;
        y=20;
    }
    ConstructorDemo(int a, int b) // default constructor
    {
        x=a;
        y=b;
    }
    void display()
    {
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        ConstructorDemo cm = new ConstructorDemo();// Invoke default constructor
        cm.display(); // 30
        ConstructorDemo cm2 = new ConstructorDemo(100, 200);// Invoked parameterized constructor
        cm2.display(); // 300

    }
}
