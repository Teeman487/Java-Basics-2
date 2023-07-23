package JavaArrays_String;

public class StudentMain {
    public static void main(String[] args) {

        Student stu1 = new Student(1010,"John",'A'); // 3 assign values by uing constructor variable

        //1 assign values by using reference variable
     /*stu1.sid=1010;
     stu1.sname = "John";
     stu1.grade ='A';*/

        //2 Assign Values by using method
//        stu1.getValues(1010,"John", 'A');
        stu1.display();

    }
}
