class InvalidMarksException extends Exception
{
    public InvalidMarksException(String message)
	{
        	super(message);
    	}
}

public class FinalGradeCalculator
{
    static void validate(int mark) throws InvalidMarksException 
	{
        	if (mark < 0 || mark > 100)
		{
            		throw new InvalidMarksException("Invalid mark: " + mark + ". Marks must be between 0 and 100.");
        	}
    	}

    public static void main(String[] args) 
	{

        	int m1 = 85, m2 = 92, m3 = 78;

        	try {
            	validate(m1);
           	validate(m2);
            	validate(m3);

            	double average = (m1 + m2 + m3) / 3.0;

            	char grade;
            	if (average >= 90) grade = 'A';
            	else if (average >= 75) grade = 'B';
            	else if (average >= 60) grade = 'C';
            	else if (average >= 40) grade = 'D';
            	else grade = 'F';

            	System.out.println("Marks: " + m1 + ", " + m2 + ", " + m3);
            	System.out.println("Average: " + average);
            	System.out.println("Grade: " + grade);

        	} catch (InvalidMarksException e)
		{
            		System.out.println("Error: " + e.getMessage());
       		}
    }
}
