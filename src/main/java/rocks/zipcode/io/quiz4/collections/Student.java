package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    Integer id;
    Double totalStudyTime;
    ArrayList<Student> students = new ArrayList<>();

    public Student() {
        this(null);
    }

    public Student(Integer id) {
        this.id = id;
        totalStudyTime = 0D;
    }

    public void learn(Double amountOfHours) {
        totalStudyTime += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
