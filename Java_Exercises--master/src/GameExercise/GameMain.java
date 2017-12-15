package GameExercise;
import java.util.Scanner;
// Import scanner object
public class GameMain {
	
	
	static int[][] positions = new int [5][5];
	 //. 2d array comprised of integers
	        
		static int TempValue = 0;	
		
		public static void main(String[] args) {
		
		


			for(int x =0; x < 5; x++) {
				for(int y =0; y <5; y++)
					positions[x][y] = TempValue;
				TempValue +=0;
				
			}
			 playerPosition();
			for (int x =0; x <5; x++){
				for(int y=0; y<5; y++)
					System.out.print(positions[x][y]); // x and y other way round
				System.out.println(" ");
			}
			
		       System.out.println();
		       
		       playerInput();
		
		
		
		
		
		// what the grid looks like
					//default value of each int is 0
					/*{ 0, 0, 0, 0, 0 },
					  { 0, 0, 1, 0, 0 },
					  { 0, 0, 0, 0, 0 },
					  { 0, 0, 0, 0, 0 },
					  { 0, 0, 0, 0, 0 },
					  
					*/
		       
		    // what the grid looks like
				//default value of each int is 0
				/*{ 0,0 0,1 0,2 0,3 0,4 },
				  { 1,1 1,1 1,3 0,4 0,5 },
				  { 2,2 1, 0, 0, 0 },
				  { 3,3 3, 0, 0, 0 },
				  { 4,4 4, 0, 0, 0 },
				  
				*/
		
        }
          
		
        public static void playerPosition () {
        	
        	
        	positions[2][2] = 1;
        }
        
        

        
        public static void playerInput () {
        	
        	Scanner scan = new Scanner(System.in);
        	
        	
        	System.out.println("Enter Direction ");
        	String Check = scan.nextLine();
        	event(Check);
        	// event(scan.nextLine());
        	
        	
        	// North = y -1
        	
		}
        
        
        public static void event(String thePlayersInput) {
        	if (thePlayersInput.equalsIgnoreCase("North")) {
        		movePlayerNorth();
       
        	}
        }
        
        public static void movePlayerNorth() {
        	
        	// check if I can move player one step nbnorth
        	
			if (thePlayers.valueOf()
        	// if I can then set current position to 0
        	// if I can't ask him to choose another way to og
        	
        }
        
        
        
	
	}


