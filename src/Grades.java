import java.util.HashMap;
import java.util.Map;

public class Grades {
    Map<String, Integer> grades = new HashMap<>();

    public Grades(){
        this.grades = new HashMap<>();
        grades.put("A1", 22);
        grades.put("A2", 21);
        grades.put("A3", 20);
        grades.put("A4", 19);
        grades.put("A5", 18);
        grades.put("B1", 17);
        grades.put("B2", 16);
        grades.put("B3", 15);
        grades.put("C1", 14);
        grades.put("C2", 13);
        grades.put("C3", 12);
        grades.put("D1", 11);
        grades.put("D2", 10);
        grades.put("D3", 9);
        grades.put("E1", 8);
        grades.put("E2", 7);
        grades.put("E3", 6);
        grades.put("F1", 5);
        grades.put("F2", 4);
        grades.put("F3", 3);
        grades.put("G1", 2);
        grades.put("G2", 1);
        grades.put("H", 0);
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }
}
