
package project7.pkg422;

public abstract class employees {
    
    private int ID ;
    private String name  ;
    private String address ;
    private int mobileNumber ;
    private String email;
    private double salary;
    
    
     
    
     public employees(int ID, String name, String address, int mobileNumber, String email, double salary) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.salary = salary;  
    }

   
     

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getMobileNumber() {
        return mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
   }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString()
   {
       return "ID: " + ID + "\nName: " + name + "\nAddress: " + address +
               "\nMobile Number: " + mobileNumber + "\nEmail: " + email +
               "\nSalary: " + salary;
   }
}
