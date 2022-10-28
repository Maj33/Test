import java.util.Scanner;

public class Essay extends TestQuestion {

	    int lines;  

	    @Override
	    protected void readQuestion() {
	       	Scanner in = new Scanner(System.in);
	        System.out.println("Enter number of lines for essay:");
	        lines = in.nextInt();
	        in.nextLine();
	        
	        
	        System.out.println("Enter the question: ");
	        Questions = in.nextLine();
	    }

	    @Override
	    public String toString() {
	    	
	        String result = Questions;
	        
	        for (int i = 0; i < lines; i++) {
	            result += "\n";
	        }
	        return result;
	    }

	}