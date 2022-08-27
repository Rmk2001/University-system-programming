
package project7.pkg422;

public class Administrationstaff extends employees {
     
    private String position;
    
     public Administrationstaff(int ID, String name, String address, int mobileNumber, String email, double salary, String position) {
        super(ID, name, address, mobileNumber,email , salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
     public void setPosition(String position) {
       this.position = position;
   }
     @Override
     public String toString()
   {
       return super.toString() + "\nPosition: " + position;
   }
    
}
