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
  
  public void setCRN(String num){
      crn = num;
  }
  public void setCourseName(String course){
      this.course = course;
  }
  public void setSection(int num){
      section = num;
  }
  public void setTitle(String title){
      this.title = title;
  }
  public void setPOI(char poi){
      this.poi = poi;
  }
  public void setPrereqs(char yOrN){
      prereqs = yOrN;
  }
  public void setATC(String atc){
      this.atc = atc;
  }
  public void setCredits(int creds){
      credits = creds;
  }
  public void setTime(String time){
      this.time = time;
  }
  public void setDays(String days){
      this.days = days;
  }
  public void setBuilding(String building){
      this.building = building;
  }
  public void setRoom(String room){
      this.room = room;
  }
  public void setInstructor(String name){
      instructor = name;
  }
  public void setRequirements(String reqs){
      requirements = reqs;
  }
}
