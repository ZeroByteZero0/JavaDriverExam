//Author Manjinder Johal
//Midterm Part 2: DriverExamDemo Program
import java.util.Scanner;
import java.util.Arrays;
public class DriverExamDemo 
{
	
	public static void main(String[] args) 
	{	
		
		DriverExam DMVTest = new DriverExam();
		
		String [] Questions = new String [15];				//declaring and initializing an array of questions
		Questions = DMVTest.Questions;						//passing Questions written in DriverExam class to the demo program
		
		char [] user_input = new char[15];					//declaring and initializing an array to store user input
		
		Scanner keyboard = new Scanner(System.in);			//creating a new scanner class to access user's keyboard input
		
		//User input block
		for(int i = 0; i < 15; i++)							//this for loop cycles through questions and takes Student Input
		{													//includes input validation utilizing a while loop
		System.out.println(Questions[i]);
		user_input[i] = keyboard.next().charAt(0);
			while(user_input[i] != 'A' && user_input[i] != 'B' && user_input[i] != 'C' && user_input[i] != 'D')
			{
			System.out.println("Invalid Response...Enter A B C or D: ");
			user_input[i] = keyboard.next().charAt(0);
			}
		}
		
		DMVTest.setUSER(user_input);						//Setting of data from user input to (DriverExam.java)
		//End of user input block
		
		
		boolean pass = DMVTest.Passed();					//utilization of method Passed from DriverExam class
		
		
		//Data output block begins with an output of whether student Passed or Failed
		if (pass)	//boolean variable holding value from Passed method
		{
			System.out.println("________________________________________________________________________");
			System.out.println("CONGRATULATIONS! YOU PASSED!" + "\n");
		}
		else
		{
			System.out.println("________________________________________________________________________");
			System.out.println("SORRY. YOU DID NOT PASS." + "\n");
		}
		
		//Statistics of Exam
		System.out.println("YOUR SCORE: " + String.format("%.2f", DMVTest.YourScore()) + "%" + "\n");
		System.out.println("# OF CORRECT ANSWERS: " + DMVTest.totalCorrect() + "\n");
		System.out.println("# OF INCORRECT ANSWERS: " + DMVTest.totalIncorrect());
		System.out.println("________________________________________________________________________\n");
		
		
		System.out.println("\n \n" + "THE QUESTIONS MISSED: \n" + Arrays.toString(DMVTest.questionsMissed()) + "\n");
		System.out.println("________________________________________________________________________\n");
		
		//End of Data Output Block

	}

}
