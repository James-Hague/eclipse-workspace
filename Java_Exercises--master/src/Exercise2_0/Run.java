package Exercise2_0;

public class Run {

	public static void main(String[] args) {
		
		Exercises exerciseVariable = new Exercises();  // exerciseVariable new class object
		
		exerciseVariable.printHello("hello world1");
		// printing return value of my String returnHelloWorld
		System.out.println(exerciseVariable.returnHelloWorld()); // 4
		     //result of numbers added numbersAdded
		int numbersAdded = exerciseVariable.AddingNums(34, 55); // defining what numbers are being added
		System.out.println(numbersAdded); // print result numbersAdded
		//6
		int conBooResult = exerciseVariable.Conditionals(34, 55, false); // if true add if false multiply
		System.out.println(conBooResult); // print result conBooResult
		//CONDITIONALS 1
		int ifIsZeroResult = exerciseVariable.checkIsZero(1, 0); // dont set boolean
		System.out.println(ifIsZeroResult);
		//CONDITIONALS 2
		ifIsZeroResult = exerciseVariable.checkIsZero(1, 2); // dont set boolean
		System.out.println(ifIsZeroResult);
	    // stored (temporary variables eg. like RAM) numbersAdded, conBooResult, ifIsZeroResult
	    
		exerciseVariable.Itteration(); // call itteration
	
	
	}

}
