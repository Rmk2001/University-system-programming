
package project7.pkg422;


import java.util.*;

public class students {
    private  int ID ;
    private  String name ;   
    private  int level ;    
    ArrayList<courses> course;
    
    
     public students( int ID,String name,int level,ArrayList<courses> course) {
        this.name = name;
        this.ID = ID;
        this.level = level;
        course = new ArrayList<>();
    }
    

    public students( int ID,String name,int level) {
        this.name = name;
        this.ID = ID;
        this.level = level;
        course = new ArrayList<>();
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCourse(ArrayList<courses> course) {
        this.course = course;
    }
    

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public ArrayList<courses> getCourse() {
        return course;
    }
    
   
    // مثيود تتسقبل اوبجكت للاضافة 
     public void addcourses (courses courses) {
        course.add(courses) ;
    }
     
     
     @Override
    public String toString() {
       return "\nStudent ID: " + ID + "\nStudent Name: " + name + "\nStudent level: " + level+"\n"; 
    }
   
    
}
