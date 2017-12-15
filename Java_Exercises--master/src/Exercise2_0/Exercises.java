package Exercise2_0;

public class Exercises {

             // 1 and 2   String is the parameter
          void printHello(String text) { // information stored in string is referred to by "text"
	          System.out.println(text); // prints the information named as text taken from the string in ex0
              }
          
          
          
	      public String returnHelloWorld() { // 4
	    	  // return string "Hello World" 
	    	  return "Hello World2";
	    	  
	      }
	      
                                // parameters
	     public int AddingNums(int Value1, int Value2) { // 5
	    	// method for adding the numbers then return to add the 
	    	 //actual numbers in the main class eg.55
	    	 return Value1 + Value2;
	     }
	     
	                                 // parameters
	     public int Conditionals (int Con1, int Con2, boolean ConBoo) {
	    	 
	    	 if (ConBoo == true) // no ; after a condition if statment is conditionnn
	    	 {
	    		 return (Con1 + Con2);         //if conboo true do this
	    	 }
	    	 else if (ConBoo == false)
	    	 {
	    		 return (Con1 * Con2);       //if conboo false do this  
	    	 }
	    	 return 0; // default if if or else are wrong somehow?????
	     }
	    	 //CONDITIONALS 2
	    	 public int checkIsZero (int Num1, int Num2) { // just  no boolean being used
		    	 
		    	 if (Num2 == 0) // no ; after a condition if statment is conditionnn
		    	 {
		    		 return (Num1);         //if true do this
		    	 }
		    	 else if (Num1 == 0)
		    	 {
		    		 return (Num2);       //if  false do this  
		    	 }
		    	 else {
		    		 return Num1 + Num2;
		    	 }		    	  
	    	
	    	 
	     }
	     
	     public void Itteration() {
	    	 
	    	 for (int i = 1; i <= 10; i ++ ) { // no ; on a for loop
	    		 
	    		 int itterationNumber = checkIsZero(i,2);
	    		 System.out.println(itterationNumber);
	    	 }
	    	 
	    	 
	     }
}
