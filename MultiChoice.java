import java.util.*;

public class MultiChoice extends TestQuestion {

    public String[] choices;
    public int howmany;

    @Override
    public void readQuestion() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many choices?");
        howmany = in.nextInt();
        in.nextLine();
        
        choices = new String[howmany];
        System.out.println("Input question:");
        Questions = in.nextLine();
        
        for (int i = 0; i < howmany; i++) {
            System.out.println("Input Choice " + i + ":");
            choices[i] = in.nextLine();
        }

    }

    @Override
    public String toString() {
        String output;
        output = Questions;
        char chars = 'A';
        for (int i = 0; i < howmany; i++) {
            output += ("\n" + chars + ": " + choices[i]);
            chars = (char) ((int) chars + 1);
        }
        return output;
    }

}