package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;

/**
 * @author leon on 11/12/2018.
 */
public class Student {
    Integer id;
    Double totalStudyTime;

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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", totalStudyTime=" + totalStudyTime +
                '}';
    }
}
