/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;
import java.util.ArrayList;

/**
 *
 * @author Brendan
 */
public class CourseList {
    private static final ArrayList list = new ArrayList<Course>();;
    
    public void add(Course course){
        list.add(course);
    }
    
    public boolean remove(Course course){
        return list.remove(course);
    }
}
