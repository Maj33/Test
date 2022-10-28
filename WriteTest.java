import java.io.IOException;
import java.util.*;

public class WriteTest {
    public static void main(String[] args) throws IOException {
     
        int nQuestions; 
        char type;          
		
        TestQuestion[] question = new TestQuestion[100];
        ArrayList<TestQuestion> test = new ArrayList();
        Scanner scan = new Scanner(System.in);
         
        System.out.println("How many questions?");
        nQuestions = scan.nextInt();

        for (int i = 1; i <= nQuestions; i++) {
            
            System.out.println("Enter type of question for number "+i+".");
            System.out.println("E = Essay, M = Multiple Choice:");
            type = scan.next().charAt(0);

            if (type == 'e') {
                Essay essay = new Essay();
                essay.readQuestion();
                question[i] = essay;
            }
            else if (type == 'm') {
               
                MultiChoice mc = new MultiChoice();
                mc.readQuestion();
                question[i] = mc;
            }
     
            test.add(question[i]);

        }
        
        System.out.println();
        System.out.println();
        System.out.println("Test:");
        System.out.println();
        
        
        for (TestQuestion test1 : test) {
            System.out.println(test1.toString());
            System.out.println();
        }   
     

    }
}
