// Project:- Student Attendance Management System
import java.util.*;
import java.io.FileWriter;
class Student                     
{
	Student()                            //default constructor 
	{
		System.out.println(" ");

		System.out.println("************* Welcome to Student Attendance Management System ***************");
	}
	
}
class Input extends Student                           //inheritance
{
	
	void subject()                                         
	{
		Scanner in = new Scanner(System.in);                 //scanner function
        String[] nameArray = new String[5];                   //declaration of array which contains strings
		System.out.println("Please enter name of any 5 students");
        for(int i=0;i<5;i++)                           
       { 
           nameArray[i]=in.nextLine();
       }
		
	////////////////////////////////////
		double countOs=0,countJava=0;            //java counter and os counter
		double averageOs,averageJava;             
	    String choice;        		//string variables for selecting subject
		System.out.println("*******************************************************************");
        System.out.println("Enter subject name");
		System.out.println("Press 'j' for  java or press 'o' for os");
		System.out.println("  ");
				
	    choice = in.nextLine();
		System.out.println("*******************************************************************");
		switch(choice)                                       //switch case for selecting subject
	    {
			case "j":                         //case java 
            for(int i=0;i<5;i++)                   //for loop
			{
			   
	           String select;                             
               System.out.println("Press 'p' for present or press 'a' for absent for '" +nameArray[i]+"'" );
			   
	           select=in.nextLine();
               switch(select)                     //switch case for selecting present or absents
			   {
				   case "p":
				   
				   countJava++;
				   break;
				   case "a":

				   break;
				   default :
				   System.out.println("Please press p or a only");
			   }	
                      
						 //switch case for present or absent closed			
			}                              //for loop closed

		            System.out.println("*******************************************************************");
	             	System.out.println("total java attendance is = "+countJava);                //print java attendance
			     	averageJava=(countJava/5)*100;	
                    System.out.println("Average attendance of java is = "+averageJava+" %");    	//print average java attendance				
			         
			break;
			           //case java closed
					   
            case "o"	:                            //case os 
			for(int i=0;i<5;i++)                          //for loop
			{
			 
	           String selectOs;                                                      //string variable declaration
               System.out.println("Press 'p' for present or press 'a' for absent for '" +nameArray[i]+"'" );  
	           selectOs=in.nextLine();
               switch(selectOs)
			   {
				   case "p":               //switch case for selecting present or absents

				   countOs++;
				   break;
				   case "a":

				   break;
				   default :
				   System.out.println("please press p or a only");
			   }
                    //switch case for present or absent closed
		      
		       
			}                                  //for loop closed
		       System.out.println("*******************************************************************");
			   System.out.println("total os attendance is = "+countOs);
   			   averageOs=(countOs/5)*100;
			   System.out.println("Average attendence of os is = "+averageOs+" %");
              			   
			
			break;
			             //case os closed
			
			default :
			System.out.println("this is not valid so please try again");
			
		}    // switch case for selecting subject closed
		
		
	} 	         //methode  subject closed
	void display()
	
	{
		System.out.println("*****************************Thank You*******************************");
	}
	       //methode display closed
	
}        
 //class Input closed

class Attendance                            //main class
{
	public static void main(String args[])   
	{
		Input object = new Input();                 //creating object of class Input
		object.subject();                             //methode calling
	    object.display();
		try
		{
		FileWriter fw=new FileWriter("D:\\testout.txt");        //file handling
		fw.write("File Handling");
		fw.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Success..");
	}
}                                       