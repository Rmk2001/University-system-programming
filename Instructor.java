/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project7.pkg422;

/**
 *
 * @author pc
 */
public class Instructor  extends employees {
    
    private String rank; 
    private String specialty;
    
     public Instructor(int ID, String name, String address, int mobileNumber, String email, double salary,String rank,String specialty) {
        super(ID, name, address, mobileNumber,email , salary);
        this.rank = rank;
        this.specialty=specialty;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getRank() {
        return rank;
    }

    public String getSpecialty() {
        return specialty;
    }
     
    @Override
   public String toString(){  
       return super.toString() + "\nRank: " + rank + "\nSpeciality: " + specialty;
   }
     
    
}
