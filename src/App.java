import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static final Course COURSE_1 = new Course("java programming", 20, List.of(
        new CourseWork("Exam", 40, -1),
        new CourseWork("Essay", 40, -1),
        new CourseWork("Project", 20, -1))
    );

    public void setUpCourses(){
        Map<String, Course> setOfCourses = new HashMap<>();
        setOfCourses.put(COURSE_1.getCourseName(), COURSE_1);
    }

    public static void setContentsScore(CourseWork courseWork, String grade, Course course){
        Grades gradeSupplier = new Grades();
        Map<String, Integer> gradeMap = gradeSupplier.getGrades();
        if (courseWork.getGradePoints()!= -1) {
            System.out.println("grades already set baby");
            return;
        }
        if (gradeMap.keySet().contains(grade)){
        int gradePoints = gradeMap.get(grade);
        System.out.println(gradePoints);
        for (CourseWork cw: course.getCourseWork()){
            if (cw.getName().equals(courseWork.getName())){
                cw.setGradePoints(gradePoints);
                System.out.println(cw.getGradePoints());
            }
        }
        workOutGradeForCourse(course);
        }
        else{
            System.out.println("invalid grade bozo");
            return;
        }
    }
    private static void workOutGradeForCourse(Course course) {
        float total = 0;
        int percentage = 0;
        float totalBest = 0;
        for (CourseWork cw: course.getCourseWork()) {
            if (cw.getGradePoints()!=-1) {
                System.out.println(cw.toString());
                percentage += cw.getWeight();
                total = (float) (total + (cw.getGradePoints()*(cw.getWeight()*0.01)));
                totalBest = (float) (totalBest + 22*(cw.getWeight()*0.01));
                System.out.println(cw.getGradePoints()*(cw.getWeight()*0.01));
            }
        }
        System.out.println("You currently have " + total + " from this course/");
        System.out.println("The best you could possibly have is " + totalBest);
        System.out.println("You have completeted " + percentage + "% of the course");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        setContentsScore(COURSE_1.getCourseWork().get(0), "A5", COURSE_1);
    }
}
