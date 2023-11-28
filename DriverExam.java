//author Manjinder Johal
//Midterm Part 2 Program: DriverExam;
public class DriverExam 
{

	private char [] Exam_input = new char[15];
	
	private char [] Exam_correct_answers = 
			{'B', 'D', 'C', 'B', 'A',
			'C', 'B', 'C', 'A', 'B',
			'D', 'A', 'C', 'A', 'A'};
	
	
	//Questions for Exam written here to keep a tidy output and made public so Demo program can access the questions
	public String[] Questions = 
		{	"\nQuestion 1: What Should you do at a Stop Sign? \n "
			+ "A) Slowly accelerate \n "
			+ "B) Come to a complete stop \n "
			+ "C) Take your hands off the steering wheel \n "
			+ "D) Roll past the stop sign \n",
			"\nQuestion 2: Where can you find your spare tire? \n "
			+ "A) In the glove box \n "
			+ "B) Under the trunk liner \n "
			+ "C) Within the door panel \n "
			+ "D) Consult your vehicle's user manual \n",
			"\nQuestion 3: When can you pass a vehicle by driving off the roadway? \n"
			+ "A) If the shoulder is wide enough to accommodate your vehicle \n"
			+ "B) If the vehicle ahead of you is turning left \n"
			+ "C) Under no circumstances \n"
			+ "D) When you feel like it \n",
			"\nQuestion 4: When parallel parking on a level street: \n"
			+ "A) Your front wheels must be turned toward the street \n"
			+ "B) Your wheels must be < 18 inches from the curb \n"
			+ "C) One of your rear wheels must touch the curb \n"
			+ "D) Trick Question: You must get a permit to parallel park \n",
			"\nQuestion 5: When you are merging onto the freeway, you should be driving: \n"
			+ "A) At or near the same speed as the traffic on the freeway \n"
			+ "B) 5 to 10 MPH slower than the traffic on the freeway \n"
			+ "C) The posted speed limit for traffic on the freeway \n"
			+ "D) Whatever speed you feel like going \n",
			"\nQuestion 6: When driving in fog, you should use your: \n"
			+ "A) Fog lights only \n"
			+ "B) High Beams \n"
			+ "C) Low Beams \n"
			+ "D) Flashlight \n", 
			"\nQuestion 7: A white painted curb means: \n"
			+ "A) Loading zone for freight or passengers \n"
			+ "B) Loading zone for passengers or mail only \n"
			+ "C) Loading zone for freight only \n"
			+ "D) Loading zone for motorcycles only \n", 
			"\nQuestion 8: When a school bus is stopped with red lights flashing, you should: \n"
			+ "A) Stop, then proceed when you think all of the children have exited the bus \n"
			+ "B) Slow to 25 MPH and pass cautiously \n"
			+ "C) Stop as long as the red lights are flashing \n"
			+ "D) Slow down and exit your vehicle \n", 
			"\nQuestion 9: You just sold your vehicle.  You must notify the DMV within _ days. \n"
			+ "A) 5 \n"
			+ "B) 10 \n"
			+ "C) 15 \n"
			+ "D) 2 \n", 
			"\nQuestion 10: The Basic Speed Law of California: \n"
			+ "A) Never drive faster than the speed limit \n"
			+ "B) Never drive faster than conditions permit \n"
			+ "C) Never drive faster than 70 MPH \n"
			+ "D) Never use your turn signals \n", 
			"\nQuestion 11: How far ahead should you look down the road? \n"
			+ "A) 20 to 25 seconds \n"
			+ "B) 30 to 45 seconds \n"
			+ "C) 60 seconds \n"
			+ "D) 10 to 15 seconds \n", 
			"\nQuestion 12: Unless specified, the speed limit in residential areas is: \n"
			+ "A) 25 MPH \n"
			+ "B) 20 MPH \n"
			+ "C) 15 MPH \n"
			+ "D) 10 MPH \n", 
			"\nQuestion 13: When is it legal to block an intersection? \n"
			+ "A) When you had a green light before entering \n"
			+ "B) When there it is rush hour \n"
			+ "C) Never, under no circumstances \n"
			+ "D) When you are late to your shift at work \n", 
			"\nQuestion 14: When are roadways the most slick/slippery? \n"
			+ "A) After the first rainfall in a while \n"
			+ "B) Before the first rainfall of the season \n"
			+ "C) Never, roadways are well maintained in California \n"
			+ "D) After the second rainfall in a while \n", 
			"\nQuestion 15: You are legally intoxicated when your Alcohol Blood Volume is: \n"
			+ "A) 0.08 \n"
			+ "B) 0.04 \n"
			+ "C) 0.12 \n"
			+ "D) 0.01 \n"
			};
	
	//This method is used to access user's data input and utilize it for the remaining methods.
	public void setUSER(char user_input[])		
	{
		Exam_input = user_input;
	}
	
	
	//Returns "true" if the student passes; returns "false" if the student fails
	public boolean Passed()
	{
		boolean pass = true;
		if (totalCorrect() < 10.0)
		{
			pass = false;
		}
		if (totalCorrect() >= 10.0)
		{
			pass = true;
		}
		return pass;
		
	};
	
	//Returns the total of correctly answered questions.
	public double totalCorrect()
	{
		int Number_Correct = 0;
		
		for(int i = 0; i < 15; i++)
		{
			if(Exam_input[i] == Exam_correct_answers[i])
				Number_Correct++;
		}
		
		return Number_Correct;
	};          	
	
	//Returns the total of incorrectly answered questions.
	public double totalIncorrect()
	{
		int Number_Incorrect = 0;
		
		for (int i = 0; i < 15; i++) 
		{
		if(Exam_input[i] != Exam_correct_answers[i])
			Number_Incorrect++;
		}
		return Number_Incorrect;
	};       	
	
	//Returns an array containing the missed questions.
	public String [] questionsMissed()
	{
		String [] Missed_Questions = new String[15];
		for(int i = 0; i < 15; i++)
		{
			if(Exam_input[i] != Exam_correct_answers[i])
			{
			Missed_Questions[i] = Questions[i];
			}
			
		}
		
		return Missed_Questions;
	};
			
	
	//Returns the User's score as a percentage.
	public double YourScore()
	{
		return (totalCorrect()/15) * 100;
	};
	
	
} 