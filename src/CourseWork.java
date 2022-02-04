

public class CourseWork {
    String name;
    int weight;
    int GradePoints;

    public CourseWork(String name, int weight, int gp){
        this.name = name;
        this.weight = weight;
        this.GradePoints = gp;
    }

    public int getGradePoints() {
        return GradePoints;
    }
    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    public void setGradePoints(int gradePoints) {
        GradePoints = gradePoints;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "" + name + weight + GradePoints + "!!!!!!!!!!!!"; 
    }
}
