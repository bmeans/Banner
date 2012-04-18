/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 *
 * @author Brendan
 * @author Daniel
 * 
 * 
 */
public class Student extends UMWPerson{
    
    //data members
    private static final CourseList currentCourses = new CourseList();
    private static final CourseList prevCourses = new CourseList();
    private String classLevel;
    private int GPA;
    
    //constructor
    Student(String bannerid){
        super.setFirstName("");
        super.setLastName(" ");
        super.setPassword(" ");
        super.setUserName(" ");
        classLevel = "";
        GPA = 0;
    }
    
    //add courses
    private void addCurrentCourses(Course course){
        currentCourses.add(course);
    }
    
    private void addPreviousCourses(Course course){
        prevCourses.add(course);
    }
    
    //setters
  
    private void setClassLevel(String level){
        classLevel = level;
    }
    
    private void setGPA(int gpa){
        GPA = gpa;
    }
    
    //getters
    private CourseList getCurrentCourses(){
        return currentCourses;
    }
    
    private CourseList getPreviousCourses(){
        return prevCourses;
    }
    
    private String getClassLevel(){
        return classLevel;
    }
    
    private int getGPA(){
        return GPA;
    }
    
    
}
