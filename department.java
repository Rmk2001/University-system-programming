
package project7.pkg422;

import java.util.ArrayList;

public class department{
    
   
   public String name ;
   public int  number  ;
    ArrayList<students> students;

    public department(String name, int number, ArrayList<students> students) {
        this.name = name;
        this.number = number;
       students = new ArrayList<>();
    }
   
    
    public department(String name,int number) {
        this.name = name;
        this.number = number;
        students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<students> getStudents() {
        return students;
    }
    
     public void adddstudent (students stu) {
        students.add(stu) ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStudents(ArrayList<students> students) {
        this.students = students;
    }
     
     @Override
    public String toString() {
        return "\nDepartment Name: " + name + "\nDepartment Number: " + number+"\n";           
    }
    
}
