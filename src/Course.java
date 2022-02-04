import java.util.List;
import java.util.Map;

public class Course {
    String courseName;
    int credits;
    List<CourseWork> coursework;
    
    public Course(String name, int credits, List<CourseWork> coursework) {
        this.courseName = name;
        this.credits = credits;
        this.coursework = coursework;
    }
public String getCourseName() {
    return courseName;
}

public List<CourseWork> getCourseWork() {
    return coursework;
}

public int getCredits() {
    return credits;
}

public void setCourseName(String courseName) {
    this.courseName = courseName;
}
public void setCoursework(List<CourseWork> coursework) {
    this.coursework = coursework;
}
public void setCredits(int credits) {
    this.credits = credits;
}


}
