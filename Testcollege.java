/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project7.pkg422;
import java.io.*;
import java.util.*;
public class Testcollege {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          employees Emp;
          ArrayList<employees> emp = new ArrayList<>(); 
          ArrayList<students> stud = new ArrayList<>();
          ArrayList<courses> list_Course = new ArrayList<>();
          
           department PH = new department("Physical" , 101) ;
           department CS = new department("Computer Scince" , 102) ;
           department Math = new department("Math" , 103) ;

       List<department> list_dep = new ArrayList<>();
       list_dep.add(PH);
       list_dep.add(CS);
       list_dep.add(Math);
           
          
        Scanner inputFile=null;
        File myFile = new File("staff.txt");
        try {
        inputFile = new Scanner(myFile);
        } catch (FileNotFoundException ex){
        }
    // check the file 
        while(inputFile.hasNext())
       {
         String id =inputFile.next();
          String name = inputFile.next();
          String address = inputFile.next();
          String mobileNumber = inputFile.next();
          String email = inputFile.next();
          double salary = Double.parseDouble(inputFile.next());
          String position = inputFile.next();
          Emp = new Administrationstaff(Integer.parseInt(id),name,address,Integer.parseInt(mobileNumber),email,salary,position);
          emp.add(Emp);
       }
       inputFile.close();
           inputFile.close();
            boolean state = false ;
           System.out.println("__________________Collage Addminstration__________________"); 
           while (state != true ){
           System.out.print("Enter ID : ");
           int id = sc.nextInt();
           System.out.print("Enter Name : ");
           String Name = sc.next();
         
           for(int i=0 ; i<emp.size(); i++){            
               if(id == emp.get(i).getID()){
                if( Name.equals(emp.get(i).getName())){
                } else {
                    System.out.println("The information is not available, please try again..");
                    System.out.print("Enter ID : ");
                    id = sc.nextInt();
                    System.out.print("Enter Name : ");
                    Name = sc.next();}
               
                    state =true ;               
                    System.out.println("__________________SUCESSFULL LOGIN__________________");
                   break ;}}}
           
         // اوبجكت لاراي لسيت لاضافة العناصر  
       Emp = new Instructor(1001, "Ahmed", "Makkah", 6666, "AA99@gmail.com", 50000.00, "Docotr", "CS_Instrucor");
       emp.add(Emp);
       Emp = new Instructor(1002, "Khaled ", "Jeddah", 5555, "kkk8@gmail.com", 60000.00, "Teacher", "PH_Instrucor");
       emp.add(Emp);
       Emp = new Instructor(1003, "Tariq ", "Madina", 4444, "tt34@gmail.com", 70000.00, "Teacher", "Math_Instrucor");
       emp.add(Emp);  
           
           
        int choice =0;    
        while (choice!=4) {
               System.out.println("__________________Control___________________________");

           System.out.println("1.Staff Selection Screen");
           System.out.println("2.Students Selection Screen");
           System.out.println("3.Schedule Selection Screen");
           System.out.println("4.Exit");
           System.out.print("Enter your choice:");
           choice = sc.nextInt();
           int ID ;
           String name  ;
           String address ;
           int mobileNumber ;
           String email;
           double salary;
           String position;
           String rank;
           String speciality;

           switch (choice) {
           case 1:

           {
                  int ch1 =0 ;
                  System.out.println("__________________Staff Selection Screen__________________");
                  while (ch1!=3) {
                  System.out.println("1.add Employee ");
                  System.out.println("2.Print Employee Information ");
                  System.out.println("3:Back to the main Screen");
                  System.out.print("Enter Your Choose: ");
                  ch1 = sc.nextInt();
                  int ch =0 ;
                  switch(ch1)
                  {
                      case 1: {
                          System.out.println("Enter Employee details");
                          System.out.println("1: Instrucor  ") ;
                          System.out.println("2: AdministrativeStaff");
                          System.out.print("Enter Your Choose : ");
                          ch = sc.nextInt();
                          
                          
               System.out.print("Enter Employee ID :");
               ID = sc.nextInt();
               System.out.print("Enter Employee Name :");
               name = sc.next();
               System.out.print("Enter Employee Address :");
               address = sc.next();
               System.out.print("Enter Employee Mobile Number :");
               mobileNumber = sc.nextInt();
               System.out.print("Enter Employee Email :");
               email = sc.next();
               System.out.print("Enter Employee Salary :");
               salary = sc.nextDouble();
               if(ch==1)
               {
               System.out.print("Enter Employee Rank :");
               rank = sc.next();
               System.out.print("Enter Employee Speciality :");
               speciality = sc.next();
               Emp = new Instructor(ID,name,address,mobileNumber,email,salary,rank,speciality);
                //Adding emp Object to List object
               emp.add(Emp); 
               }
               if(ch==2)
               {
                 System.out.print("Enter Employee Position :");
                 String position1 = sc.next();  
                 Emp = new Administrationstaff(ID, name, address, mobileNumber, email, salary,position1);
                //Adding emp Object to List object
                 emp.add(Emp); 
               }
                  //Creating doctor object by passing required details
                 }break;
                    case 2: {
                         System.out.println("Print employee information");
                          System.out.println("1: Instrucor  ") ;
                          System.out.println("2: AdministrativeStaff");
                          System.out.print("Enter Your Choose : ");
                          ch = sc.nextInt();
                     for (employees employee : emp) {    
                        if (employee instanceof Administrationstaff&&ch==2) {
                             
                         System.out.println("__Administrative staff__");
                         System.out.println(employee.toString());
//                       System.out.println("Id:" + employee.getID());
//                       System.out.println("Name:" + employee.getName());
//                       System.out.println("Address :" + employee.getAddress());
//                       System.out.println("Mobile Number: " + employee.getMobileNumber());
//                       System.out.println("Email : " + employee.getEmail());
//                       System.out.println("Salary :" + employee.getSalary());
//                       System.out.println("Position :" + ((Administration_staff) employee).getPosition());
                        } 
                             if(employee instanceof Instructor && ch ==1){                                
                        System.out.println("__Instructor staff__");
                        System.out.println(employee.toString());
//                       System.out.println("Id:" + employee.getID());
//                       System.out.println("Name:" + employee.getName());
//                       System.out.println("Address :" + employee.getAddress());
//                       System.out.println("Mobile Number: " + employee.getMobileNumber());
//                       System.out.println("Email : " + employee.getEmail());
//                       System.out.println("Salary :" + employee.getSalary());
//                       System.out.println("Rank :" + ((Instructor) employee).getRank());
//                       System.out.println("speciality :" + ((Instructor) employee).getSpecialty());
                         }
                           
                      }
                      break ;
                      
                  
           }   }   }}
               break;
           case 2:
           {
               System.out.println("__________________Students Selection Screen__________________");
                int ch1 =0 ;
                int input =0 ;
                students S ;
                while (ch1!=5) {
                  System.out.println("1.Add Student  ");
                  System.out.println("2.Print the Student information (depending on the ID)   ");
                  System.out.println("3.Register the course for the student (depending on the level)   ");
                  System.out.println("4.Print the student schedule (depending on the level)");
                  System.out.println("5.Back to the main Screen");                  
                  System.out.print("Enter Your Choose : ");
                  ch1 = sc.nextInt();
                  switch(ch1)
                  {
                      case 1: {
                           System.out.println("Enter the student information:");  
                            System.out.println("choose The Department of Student : ");
                           int k = 0 ;
                           for(int i=0 ; i<list_dep.size();i++)
                           {
                               k+=1 ;
                               System.out.println(k+ ": "+ list_dep.get(i).getName());
                           }
                           System.out.print("Choose number 1 or 2 or 3: ");
                            input = sc.nextInt();
                           System.out.print("Enter Student ID : ");
                           ID = sc.nextInt();
                           System.out.print("Enter Student Name :");
                           name = sc.next();
                           System.out.print("Enter Student Level : ");
                           int level = sc.nextInt();
                            S = new students(ID,name,level);
                           stud.add(S);
                            if(input == 1)
                     {
                        PH.students.add(S);
                      }
                       if(input == 2)
                      {
                        CS.students.add(S);
                     }
                      if(input == 3)
                   {
                      Math.students.add(S);
                   }
                      }break ;
                      
                      case 2: {
                          boolean found = false ;
                          System.out.print("Enter ID Student to print information : ");
                          ID = sc.nextInt();
                          for(int i=0 ; i<stud.size();i++)
                          {if(ID == stud.get(i).getID()){
                                System.out.print("___Student information___");
                                System.out.print(stud.get(i));
                                System.out.print("___Department information___");
                                System.out.print(list_dep.get(i));
                                found = true ;
                                break;
                              }
                          }
                          if(found == false)
                          {
                              System.out.println("There is no Student to Print info");
                           }
                      }break ;
                      case 3 : {
                         System.out.print("Enter Level of Students : ");
                           int level =sc.nextInt();
                           int ch;
                           int ins_id;
                           do {
                               System.out.print("Enter Number of course : ");
                               ID =sc.nextInt();
                               System.out.print("Enter Name of course : ");
                               name =sc.next();
                               System.out.print("Enter ID of Instructor : ");
                                ins_id = sc.nextInt();
                               System.out.println("To continue adding Enter number 0, to exit Enter 1:");
                               ch =sc.nextInt ();
                           }while(ch == 0);
                           students e =new students(ID,name,level);
                        Instructor instr= null ;
                                for (employees employee : emp) {
                            if ( employee instanceof Instructor) {
                                 
                               if(ins_id== employee.getID())
                               {
                                   instr =(Instructor) employee;
                                 break ;}}}                                                   
                          list_Course.add(new courses(ID,name,level,instr));
                           for(int i=0;i>stud.size();i++){
                              if (level == stud.get(i).course.get(i).getLevel()){
                                  stud.add(e);
                          }}
                          }  break;
                      case 4: {
                        System.out.print("Enter Level of Students : ");
                        int level =sc.nextInt();
                        for(int i=0;i<stud.size();i++){
                        if (level==stud.get(i).getLevel()){
                            System.out.print("___Student information___");
                            System.out.print(stud.get(i));
                            System.out.print("___Department information___");
                            System.out.print(list_dep.get(i));
                            System.out.print("___Course information___");
                            System.out.print(list_Course.get(i)+"\n"); 

                        
                        }}  
             break;          
     }}}}
           break;
        case 3:
             System.out.println("__________________Schedule Selection Screen__________________");
                int ch2 =0 ;
                while (ch2!=4) {
                       System.out.println("1:Add Courses (will fill the Courses collection by reading all its information) ");
                       System.out.println("2:Print the Courses information  (depending on the course number)");
                       System.out.println("3:Print the Student in the Course (depending on the course number)");
                       System.out.println("4:Back to the main Screen");
                       System.out.print("Enter Your Choose : ");
                        ch2= sc.nextInt();
                       switch(ch2)
                       {
                           case 1:{
                               System.out.println("Add Course information : ") ;
                               System.out.print("Course Name : ");
                               name = sc.next();
                               System.out.print("Course ID: ");
                               int num =sc.nextInt();
                               System.out.print("Course Level : ");
                               int level =sc.nextInt();
                               int i = 0;
                               System.out.print("Enter ID of Instructor : ");
                               int ins_id = sc.nextInt();
                                 Instructor instr= null ;
                                for (employees employee : emp) {
                            if ( employee instanceof Instructor) {   
                               if(ins_id== employee.getID())
                               {
                                 instr =(Instructor) employee;
                                 break ;}}}                       
                             list_Course.add(new courses(num,name,level,instr));   
                           }break ;
                           case 2 :
                           {
                               System.out.print("Enter Number of Course : ");
                               int numC = sc.nextInt();
                               for(int i=0 ; i<list_Course.size();i++){
                                   if(numC ==list_Course.get(i).getNumber())
                                   {
                            System.out.print("___Course information___");
                            System.out.print(list_Course.get(i)+"\n"); 
//                            System.out.println("course Name : "+list_Course.get(i).name);
//                            System.out.println("course ID: "+list_Course.get(i).number);
//                            System.out.println("course level : "+list_Course.get(i).level);
//                            System.out.println("___Instructor information___\n"+list_Course.get(i).instr.toString()+"\n");
                                   }
                                  break;
                               }
                                
                           } break ;
                           case 3 :
                           {   boolean found = false ;
                               System.out.print("Enter number of Course : ");
                               int numC = sc.nextInt();
                               for(int i=0 ; i<stud.size();i++)
                               {
                                   for(int j=0 ; j<stud.get(i).getCourse().size();j++)
                                   if(numC == stud.get(i).course.get(j).getNumber())
                                   {
                            System.out.print("___Student information___");
                            System.out.print(stud.get(i));
                            System.out.print("___Department information___");
                            System.out.print(list_dep.get(i));
                                      found = true ;
                                      break;
                              }
                          }
                          if(found == false)
                          {
                              System.out.println("There is no Student to Print info");
                           }
                                   }
                               }
                           }
               break; 
              case 4 :
              System.out.println("Exit..Good Bye..");
              break;    
                  default:
              case 5 :
              
                     System.out.println("Wrong Choice!!!");}}
        

           
           
              
     
    
           
        
    }// the end main method
    
}// the end class Testcollege
