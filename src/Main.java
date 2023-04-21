import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> logFile = Methods.readFile();

        int amountOfErrors = Methods.countErrors(logFile);
        System.out.println("There are " + amountOfErrors + " Errors" + "\n");

        System.out.println("Here is the gitActivity: ");
        ArrayList<String> gitActivity = Methods.getGitActivity(logFile);


    }
}