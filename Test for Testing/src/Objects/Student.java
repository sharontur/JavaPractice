package Objects;

public class Student {

    private Course[] courses;
    private int numOfCourses;
    private final int MAX_COURSES = 30;

    // constructor
    public Student(){
        this.courses = new Course[MAX_COURSES];
        numOfCourses = 0;
    }

    public Course maxPoints() {
        Course max = courses[0];
        for (int i = 1; i < this.numOfCourses; i++) {
            if (courses[i].getCoursePoints() > max.getCoursePoints()) {
                max = courses[i];
            }
        }
        return max;
    }

    private void addCourse(Course course) {
        courses[numOfCourses] = new Course(course);
        numOfCourses++;
    }

    public static void main(String[] args){
        Student student = new Student();
        Course course = new Course(60);
        student.addCourse(course);
        Course course1 = new Course(90);
        Course course2 = new Course(70);
        student.addCourse(course1);
        student.addCourse(course2);

        Course maxCourse = student.maxPoints();
    }
}
