
package project7.pkg422;

public class courses  {
    int  number ;
    String name ; 
    int level; 
    Instructor instr ; //obj 
    
     public courses ( int number,String name, int level) {
        this.name = name;
        this.number = number;
        this.level = level;
       
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public Instructor getInstr() {
        return instr;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setInstr(Instructor instr) {
        this.instr = instr;
    }
     

    public courses ( int number, String name, int level, Instructor instr) {
        this.name = name;
        this.number = number;
        this.level = level;
        this.instr = instr;
    }
      @Override
    public String toString() {
        return "\ncourse Name: " + name + "\ncourse ID: " + number + "\ncourse level: " + level+"\n___Instructor information___\n"+instr;
    }
    
    
}
