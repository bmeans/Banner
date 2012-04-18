/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

import java.sql.ResultSet;

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
        super.setBannerID(bannerid);
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
    protected String getSchedule()
    {
        String schedule ="";
         try {
           
            String bannerid = this.getBannerID();
            ResultSet rset = Db.getData("SELECT * FROM courses c INNER JOIN studentCourses sc INNER JOIN users u ON "
                    + "c.crn = sc.crn and sc.bannerid = u.bannerid AND u.bannerid = " + bannerid +";");
            //String info="";
            while (rset.next()) {
                 //System.out.println("here");
                 String crn = rset.getString("crn").trim(); 
                 String course = rset.getString("course").trim();
                 String section = rset.getString("section").trim();
                 String title = rset.getString("title").trim();
                 String days = rset.getString("days").trim();
                 String time = rset.getString("time").trim();
                 
                  schedule +=(crn + course + section + title + days + time + "\n") ;
                   }        
            } catch (Exception e) {
                System.out.println(e);
               }
           return schedule;
    }
    
    
}
