package Objects;

public class Course {
    private int coursePoints;

    public Course(int coursePoints){
        this.coursePoints = coursePoints;
    }

    public Course(Course other){
        coursePoints = other.coursePoints;
    }

    public int getCoursePoints() {
        return coursePoints;
    }

    public void setCoursePoints(int coursePoints) {
        this.coursePoints = coursePoints;
    }
}
