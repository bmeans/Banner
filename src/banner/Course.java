/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package banner;

/**
 *
 * @author Brendan
 */
public class Course {
  private String crn ;
  private String course;
  private int section;
  private String title;
  private char poi;
  private char prereqs;
  private String atc;
  private int credits;
  private String time;
  private String days;
  private String building;
  private String room;
  private String instructor;
  private String requirements;
  
  public String getCRN(){
      return crn;
  }
  public String getCourseName(){
      return course;
  }
  public int getSection(){
      return section;
  }
  
  public String getCourseTitle(){
      return title;
  }
  public char getPOI(){
      return poi;
  }
  public char getPrereqs(){
      return prereqs;
  }
  public String getATC(){
      return atc;
  }
  public int getCredits(){
      return credits;
  }
  public String getTime(){
      return time;
  }
  public String getDays(){
      return days;
  }
  public String getBuilding(){
      return building;
  }
  public String getRoom(){
      return room;
  }
  public String getFaculty(){
      return instructor;
  }
  public String getRequirements(){
      return requirements;
  }
}
