package CodSoft_Task;

import java.util.ArrayList;
import java.util.List;
class Course {
	private String courseCode;
    private String title;
    private String description;
    private int capacity;
    private int enrolled;

    public Course(String courseCode, String title, String description, int capacity) {
        this.courseCode = courseCode;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.enrolled = 0;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getEnrolled() {
        return enrolled;
    }

    public void enrollStudent() {
        if (enrolled < capacity) {
            enrolled++;
        } else {
            System.out.println("Course " + title + " is already full.");
        }
    }

    public void dropStudent() {
        if (enrolled > 0) {
            enrolled--;
        } else {
            System.out.println("No students are enrolled in course " + title + ".");
        }
    }
}

class Student {
    private String studentID;
    private String name;
    private List<Course> registeredCourses;

    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void registerCourse(Course course) {
        registeredCourses.add(course);
        course.enrollStudent();
    }

    public void dropCourse(Course course) {
        registeredCourses.remove(course);
        course.dropStudent();
    }
}

public class Course_Registration{
    public static void main(String[] args) {
        Course course1 = new Course("IT101", "Java Programming", "Introduction to Java", 30);
        Course course2 = new Course("CSE201", "Python", "Basics of Python", 25);
        Student student1 = new Student("58", "Dhoni");
        Student student2 = new Student("51", "Mahi");
        student1.registerCourse(course1);
        student1.registerCourse(course2);
        student2.registerCourse(course1);
        student1.dropCourse(course2);
        Courseinfo(course1);
        Courseinfo(course2);
        Studentinfo(student1);
        Studentinfo(student2);
    }

    public static void Courseinfo(Course course) {
        System.out.println("Course Code: " + course.getCourseCode());
        System.out.println("Title: " + course.getTitle());
        System.out.println("Description: " + course.getDescription());
        System.out.println("Capacity: " + course.getCapacity());
        System.out.println("Enrolled: " + course.getEnrolled());
        System.out.println();
    }

    public static void Studentinfo(Student student) {
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Name: " + student.getName());
        System.out.println("Registered Courses:");
        for (Course course : student.getRegisteredCourses()) {
            System.out.println(course.getTitle());
        }
        System.out.println();
    }
}
