package rocks.zipcode.io.quiz4.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {
    Map <Student, Double> myMap = new HashMap<>();

    public void enroll(Student student) {
        myMap.put(student, 0D);
    }

    public Boolean isEnrolled(Student student) {
        if(myMap.containsKey(student)){
            return true;
        }

//        for (Student zcStudents : myMap.keySet()){
//            if(student.equals(zcStudents)){
//                return true;
//            }
//        }
        return false;
    }

    public void lecture(double numberOfHours) {
//        for(Student student : myMap.keySet()){
//            Double hours = myMap.get(student) + numberOfHours;
//            myMap.replace(student, hours);
//        }
        System.out.println(myMap.entrySet());
    }

    public Map<Student, Double> getStudyMap() {
        return myMap;
    }
}
