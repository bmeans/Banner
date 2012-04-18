/*
 * 
 */
package banner;

import java.sql.ResultSet;

/**
 *
 * @author daniel
 */

public class Search {
//    public static void main(String args[]){
//        try{
//            search("course", "ARAB");
//            search("title", "Individual Study");
//            search("instructor", "Kim");
//        }catch(Exception e){
//            System.err.println(e);
//        }    
//    }
    
    public static String search(String type, String specific) throws Exception{
        String info="";
        try {
            ResultSet rset = Db.getData("SELECT * FROM courses WHERE " 
                    +type +" like "+ "\'%"+specific+"%\'");
            
            while (rset.next()) {
                    info += rset.getString("crn") + " " 
                            + rset.getString("course") + " "
                            + rset.getString("section") + " "
                            + rset.getString("title") + " "
                            + rset.getString("instructor")+ " "
                            + rset.getString("days")+ " "
                            + rset.getString("time")+ "\n";
                
            }
//            System.out.println(info);
            } catch (Exception e) {
                System.out.println(e);
            }
        return info;
    }
}
