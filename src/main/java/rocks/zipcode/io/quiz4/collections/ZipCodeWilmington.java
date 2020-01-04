package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    Map <Student, Double> myMap = new LinkedHashMap<>();

    public void enroll(Student student) {
        myMap.put(student, student.getTotalStudyTime());
    }

    public Boolean isEnrolled(Student student) {
        if(myMap.containsKey(student)){
            return true;
        }
        return false;
    }

    public void lecture(double numberOfHours) {
        for(Student student : myMap.keySet()){
            student.learn(numberOfHours);
        }

        //        for(Student student : myMap.keySet()){
//            Double hours = myMap.get(student) + numberOfHours;
//            myMap.replace(student, hours);
//        }
        //myMap.put(student, student.learn(numberOfHours))
        System.out.println(myMap.entrySet());
    }

    public Map<Student, Double> getStudyMap() {
        //List<Student, Double> entrySet = new ArrayList<>(myMap.entrySet());
        Map<Student, Double> result = new LinkedHashMap<>();
        for (Student student : myMap.keySet()){
            result.put(student, student.getTotalStudyTime());
        }
        return result;
    }
}
