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
public class Faculty extends UMWPerson{
    
    private static final CourseList currentCourses = new CourseList();
    
    public Faculty (String bannerID){
        super.setBannerID(bannerID);
    }
    
    public void addCourse(Course course){
        currentCourses.add(course);
    }
    
    public boolean removeCourse(Course course){
        return currentCourses.remove(course);
    }
}
