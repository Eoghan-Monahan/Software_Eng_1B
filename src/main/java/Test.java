import org.joda.time.DateTime;

import java.util.ArrayList;

public class Test {
    public static void main (String args[]){
        ArrayList<Module> modules = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();
        Module testModule1 = new Module("Software Engineering","CT417");
        Module testModule2 = new Module("Machine Learning", "CT4101");
        modules.add(testModule1);
        modules.add(testModule2);
        DateTime startDate = new DateTime(2017, 9, 1, 0, 0);
        DateTime endDate = new DateTime(2021, 5, 31, 0, 0);
        Course testCourse1 = new Course("Electronic and Computer Engineering", modules, startDate, endDate);
        Course testCourse2 = new Course("CS&IT", modules, startDate, endDate);
        courses.add(testCourse1);
        courses.add(testCourse2);
        Student tester = new Student("Test", 20, "8/11/2020", "12345678", modules, courses);
        Student tester2 = new Student("Test2", 20, "8/11/2020", "12345678", modules, courses);
        students.add(tester);
        students.add(tester2);
        System.out.println("Student List");
        System.out.println(students);
        testModule1.addStudent(tester);
        testCourse1.addModule(testModule1);
        System.out.println("Course List");
        System.out.println(courses);
    }
}
