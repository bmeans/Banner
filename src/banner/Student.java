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
    private Course currentCourses;
    private Course prevCourses;
    private String classLevel;
    private int GPA;
    
    //constructor
    Student(){
        GPA = 0;
    }
    
    //setters
    private void setCurrentCourses(Course toAdd){
        
    }
    
    private void setPreviousCourses(Course toAdd){
        
    }
  
    private void setClassLevel(String level){
        classLevel = level;
    }
    
    private void setGPA(int gpa){
        GPA = gpa;
    }
    
    //getters
    private Course getCurrentCourses(){
        return currentCourses;
    }
    
    private Course getPreviousCourses(){
        return prevCourses;
    }
    
    private String getClassLevel(){
        return classLevel;
    }
    
    private int getGPA(){
        return GPA;
    }
    
    
}
