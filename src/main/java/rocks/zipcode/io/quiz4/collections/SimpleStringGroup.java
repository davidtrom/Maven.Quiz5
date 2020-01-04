package rocks.zipcode.io.quiz4.collections;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable{

    ArrayList<String> stringGroup;

    public SimpleStringGroup() {
        stringGroup = new ArrayList<>();
        //throw new UnsupportedOperationException("Method not yet implemented");
    }

    public Integer count() {
        return stringGroup.size();
    }

    public void insert(String string) {
        stringGroup.add(string);
    }

    public Boolean has(String string) {
        return stringGroup.contains(string);
    }

    public String fetch(int indexOfValue) {
        return stringGroup.get(indexOfValue);
    }

    public void delete(String string) {
        stringGroup.remove(string);
    }

    public void clear() {
        stringGroup.clear();
    }

    @Override
    public Iterator iterator() {
        return stringGroup.iterator();
    }
}
