/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass3grading;

/**
 *
 * @author Sameen Naqvi
 */
public class Ass3grading {
      
      static public String marks(int ass,int mid,int finals ) {//numbers input from 100
          int sum=ass+mid+finals;
          String var=grade(sum);
            return gpa(var);
	       
	            //else if (all attributes marks less then below the lowest range)
	   }
       static public String grade( int result ) {
           
	       if ( result >= 90 ) 
	                return("A");
	            else if (  result >= 80) 
	                return("B");
	            
	             else if (result >= 70 ) 
	                return("C");
	            else if ( result >= 50) 
	               return("D");
	                else
	                return("F");
	            //else if (all attributes marks less then below the lowest range)
	   }
       static public String gpa(String a   ) {
           if ( a == "A"  ) 
	         return("4.10");
	       else if ( a == "B"  ) 
	                 return("3.33");
	            
	       else if (a == "C"  ) 
	                return("2.33");
	       else if ( a == "D" ) 
	               return("1.2");
	                else
	                return("F");
           
       }
	   
}
    
    

